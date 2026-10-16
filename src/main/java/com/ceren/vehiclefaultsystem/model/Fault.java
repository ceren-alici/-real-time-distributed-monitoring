package com.ceren.vehiclefaultsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// MODEL KATMANI:
// Bu sınıf sistemdeki bir arıza kaydını temsil eder.
// @Entity ile vertabanındakilere karşılık gelecek
@Entity
public class Fault {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String vehiclePlate;
    public String faultCode;
    public String description;
    public String severity;
    public String status;

    // JPA için boş constructor gerekli onu oluşturdum"
    public Fault() {
    }
    public Fault(int id, String vehiclePlate, String faultCode, String description, String severity, String status) {
        this.id = id;
        this.vehiclePlate = vehiclePlate;
        this.faultCode = faultCode;
        this.description = description;
        this.severity = severity;
        this.status = status;
    }
}