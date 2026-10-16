package com.ceren.vehiclefaultsystem.repository;

import com.ceren.vehiclefaultsystem.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

// REPOSITORY KATMANI----(veritabanıyla konuşan ana yer )
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
