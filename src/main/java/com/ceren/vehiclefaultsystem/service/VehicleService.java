package com.ceren.vehiclefaultsystem.service;

import com.ceren.vehiclefaultsystem.model.Vehicle;
import com.ceren.vehiclefaultsystem.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// SERVICE KATMANI
// Araçlarla ilgili iş mantığını yönetir.
// Controller doğrudan veritabanıyla konuşmaz, bu service'i kullanır.
@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    // Spring Boot repository nesnesini otomatik olarak buraya verir.
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    // Tüm araçları veritabanından getirir.
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    // Yeni araç ekler ve veritabanına kaydeder.
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    // Var olan aracı günceller.
    public Vehicle updateVehicle(int id, Vehicle newVehicle) {
        Vehicle existingVehicle = vehicleRepository.findById(id).orElse(null);

        if (existingVehicle == null) {
            return null;
        }

        existingVehicle.plate = newVehicle.plate;
        existingVehicle.model = newVehicle.model;
        existingVehicle.status = newVehicle.status;

        return vehicleRepository.save(existingVehicle);
    }

    // Aracı id değerine göre siler.
    public void deleteVehicle(int id) {
        vehicleRepository.deleteById(id);
    }


    }
