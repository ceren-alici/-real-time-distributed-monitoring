#include <Servo.h>

const int trigPin = 9;
const int echoPin = 10;

const int buttonPin = 2;
const int buzzerPin = 8;
const int servoPin = 6;

Servo servo;

void setup() {
  Serial.begin(9600);

  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);

  pinMode(buttonPin, INPUT_PULLUP);
  pinMode(buzzerPin, OUTPUT);

  servo.attach(servoPin);
  servo.write(90);

  Serial.println("Arduino initialized.");
}

void loop() {
  // HC-SR04 distance measurement
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);

  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);

  digitalWrite(trigPin, LOW);

  long duration = pulseIn(echoPin, HIGH);
  double distance = duration * 0.0343 / 2.0;

  Serial.print("Distance: ");
  Serial.print(distance, 2);
  Serial.println(" cm");

  // Servo control based on distance
  int servoAngle = map(
    constrain((int)distance, 5, 50),
    5, 50,
    180, 0
  );

  servo.write(servoAngle);

  // Distance-based buzzer warning
  if (distance < 15) {
    digitalWrite(buzzerPin, HIGH);
  } else {
    digitalWrite(buzzerPin, LOW);
  }

  // Push-button control
  if (digitalRead(buttonPin) == LOW) {
    Serial.println("BUTTON:PRESSED");

    digitalWrite(buzzerPin, HIGH);
    delay(200);
    digitalWrite(buzzerPin, LOW);

    delay(300);
  }

  delay(500);
}
