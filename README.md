Real-Time Distributed Monitoring

Overview

Real-Time Distributed Monitoring is a vehicle monitoring project developed to explore backend development, RESTful APIs, database interaction, distributed communication, graphical user interfaces, and hardware-based data acquisition.

The project combines a Java Spring Boot backend for vehicle and fault record management with TCP-based communication experiments, a Qt-based monitoring interface, and an Arduino module for distance measurement.

The project was developed incrementally to understand how software components, communication protocols, and hardware devices can contribute to a monitoring system.

Features

* Vehicle record management through RESTful API endpoints
* Fault record management
* Layered backend architecture
* Database interaction using Spring Data JPA
* CRUD operations for vehicle records
* TCP client-server communication experiments
* Qt-based graphical interface for vehicle management
* Arduino-based distance measurement using an ultrasonic sensor
* Serial communication for transmitting sensor readings
* Servo motor and buzzer control

Technologies Used

Backend

* Java 21
* Spring Boot
* Spring Data JPA
* Maven
* REST API
* H2 Database

Communication

* TCP/IP
* Client-server communication
* Python-based communication experiments

Graphical Interface

* Qt
* C++
* Qt Network

Hardware

* Arduino
* HC-SR04 ultrasonic distance sensor
* Servo motor
* Buzzer
* Push button

System Components

1. Spring Boot Backend

The backend provides RESTful API endpoints for managing vehicle information and fault records.

It uses a layered architecture to separate request handling, application logic, and database access.

Main layers:

* Controller: Handles HTTP requests and API responses.
* Service: Contains application logic.
* Repository: Manages database operations.
* Model: Represents application data.

The application uses Spring Data JPA for database interaction and H2 as its configured database.

2. TCP Client-Server Communication

A separate communication component was developed to explore data transmission between a server and a client.

The experiments involved sending data over TCP/IP, receiving streamed values, and examining the behavior of communication between different environments.

The communication component was used to study data flow and the fundamentals of distributed monitoring.

3. Qt Monitoring Interface

A Qt-based desktop application was developed to interact with the vehicle management backend.

The interface supports viewing and managing vehicle records through HTTP requests.

The application demonstrates how a graphical interface can communicate with a backend API.

4. Arduino Integration

The Arduino module demonstrates basic hardware-level monitoring using an HC-SR04 ultrasonic distance sensor.

The Arduino reads distance measurements and communicates sensor readings through the serial interface. A servo motor, buzzer, and push button provide additional hardware interaction.

Hardware details and source code are available in the arduino directory.

Project Structure

vehicle-fault-system/
├── src/
│   └── main/
│       ├── java/com/ceren/vehiclefaultsystem/
│       │   ├── controller/
│       │   ├── model/
│       │   ├── repository/
│       │   ├── service/
│       │   └── VehicleFaultSystemApplication.java
│       └── resources/
│           ├── application.properties
│           └── data.sql
├── arduino/
│   ├── README.md
│   └── vehicle-monitoring/
│       └── vehicle_monitoring.ino
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md

The Qt application and TCP communication scripts may be maintained in separate project directories.

Running the Backend

Prerequisites

* Java 21 or a compatible configured JDK
* Maven or the included Maven Wrapper

macOS and Linux

Run the following command from the project root directory:

./mvnw spring-boot:run

Windows

mvnw.cmd spring-boot:run

The application uses the configuration defined in src/main/resources/application.properties.

Arduino Source Code

The Arduino implementation is located at:

arduino/vehicle-monitoring/vehicle_monitoring.ino

For the hardware component list and additional details, see arduino/README.md.

Purpose and Learning Outcomes

This project provided practical experience with backend development, REST API design, layered software architecture, database interaction, TCP/IP communication, desktop application development, and microcontroller-based monitoring.

It also helped explore how different technologies can be used to build the individual components of a distributed monitoring system.

Future Improvements

* Integrate the backend, desktop interface, and sensor data into a unified monitoring workflow.
* Add automated tests for backend functionality.
* Expand fault detection and notification capabilities.
* Improve real-time visualization of monitoring data.
* Extend sensor integration and data processing.
