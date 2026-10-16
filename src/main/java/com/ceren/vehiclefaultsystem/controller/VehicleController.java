package com.ceren.vehiclefaultsystem.controller;

import com.ceren.vehiclefaultsystem.model.Vehicle;
import com.ceren.vehiclefaultsystem.service.VehicleService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }
    @GetMapping
    public List<Vehicle> getVehicles() {
        return vehicleService.getAllVehicles();
    }
    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.addVehicle(vehicle);
    }
    @PutMapping("/{id}")
    public Vehicle updateVehicle(@PathVariable int id, @RequestBody Vehicle vehicle) {
        return vehicleService.updateVehicle(id, vehicle);
    }

    @DeleteMapping("/{id}")
    public String deleteVehicle(@PathVariable int id) {
        vehicleService.deleteVehicle(id);
        return "Vehicle deleted successfully.";
    }
}
