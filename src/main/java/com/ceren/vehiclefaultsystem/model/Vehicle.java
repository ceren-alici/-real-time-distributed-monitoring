package com.ceren.vehiclefaultsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// ---MODEL KATMAN----
// Bu sınıf sistemdeki bir aracı temsil etsin
// @Entity sayesinde bu sınıf veritabanındaki Vehicle tablosuna karşılık
@Entity
public class Vehicle {

    // database pk
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    // Araç plakası
    public String plate;

    // Araç modeli
    public String model;

    // Araç durumu
    public String status;

    // JPA veritabanından nesne oluştururken bu boş constructor'ı kullanacak
    public Vehicle() {
    }

    // Bizim kod içinde örnek nesne oluştururken kullandığımız constructor
    public Vehicle(int id, String plate, String model, String status) {
        this.id = id;
        this.plate = plate;
        this.model=model;
        this.status = status;
    }
}