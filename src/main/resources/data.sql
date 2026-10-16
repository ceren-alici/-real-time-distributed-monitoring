INSERT INTO vehicle (plate, model, status)
VALUES ('06 ABC 123', 'Truck', 'ACTIVE');

INSERT INTO vehicle (plate, model, status)
VALUES ('34 DEF 456', 'Armored Vehicle', 'MAINTENANCE');

INSERT INTO fault
(vehicle_plate, fault_code, description, severity, status)
VALUES
    ('06 ABC 123',
     'ENGINE_TEMP_HIGH',
     'Engine temperature exceeded normal level',
     'HIGH',
     'OPEN');

INSERT INTO fault
(vehicle_plate, fault_code, description, severity, status)
VALUES
    ('34 DEF 456',
     'BRAKE_SENSOR_ERROR',
     'Invalid data received from brake sensor',
     'MEDIUM',
     'IN_REVIEW');