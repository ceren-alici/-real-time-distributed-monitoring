Real-Time Distributed Monitoring

Overview

Real-Time Distributed Monitoring is a Java-based vehicle fault monitoring project developed to explore backend development, RESTful APIs, database integration, and distributed communication.

The project provides a backend structure for managing vehicle information and tracking fault records through a REST API.

Features

* Vehicle management through RESTful API endpoints
* Fault record management
* Layered backend architecture
* Database interaction using Spring Data JPA
* Initial data configuration
* Maven-based project management

Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Maven
* H2 Database
* REST API

Project Structure

src/
└── main/
    ├── java/com/ceren/vehiclefaultsystem/
    │   ├── controller/
    │   ├── model/
    │   ├── repository/
    │   ├── service/
    │   └── VehicleFaultSystemApplication.java
    └── resources/
        ├── application.properties
        └── data.sql

Architecture

The application follows a layered architecture:

* Controller: Handles incoming HTTP requests.
* Service: Contains application logic.
* Repository: Manages data access.
* Model: Represents vehicle and fault data.

Running the Application

Prerequisites

* Java 21 or a compatible configured JDK
* Maven or the included Maven Wrapper

Run with Maven Wrapper

On macOS or Linux:

./mvnw spring-boot:run

On Windows:

mvnw.cmd spring-boot:run

The application uses the configuration defined in application.properties.

Purpose

This project was developed as a learning exercise in backend development, API design, data management, and software architecture.

Future Improvements

* Integration with real-time sensor data
* Monitoring interface integration
* Automated testing and expanded fault-handling capabilities
