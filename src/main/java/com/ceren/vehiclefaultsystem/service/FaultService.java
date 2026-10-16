package com.ceren.vehiclefaultsystem.service;

import com.ceren.vehiclefaultsystem.model.Fault;
import com.ceren.vehiclefaultsystem.repository.FaultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// SERVICE KATMANI---
// Fault (arıza) ile ilgili işi yönet
// Verileri FaultRepository den al
@Service
public class FaultService {

    private final FaultRepository faultRepository;

    // Constructor Injection:
    // Spring Boot FaultRepository nesnesini otomatik oluşturur.
    public FaultService(FaultRepository faultRepository) {
        this.faultRepository = faultRepository;
    }

    // Şimdilik veritabanındaki tüm arızaları getir.
    public List<Fault> getAllFaults() {
        return faultRepository.findAll();
    }
}
