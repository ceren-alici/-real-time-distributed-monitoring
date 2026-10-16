package com.ceren.vehiclefaultsystem.controller;

import com.ceren.vehiclefaultsystem.model.Fault;
import com.ceren.vehiclefaultsystem.service.FaultService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/faults")
public class FaultController {

    private final FaultService faultService;

    public FaultController(FaultService faultService) {
        this.faultService = faultService;
    }
    public FaultService getFaultService() {
        return faultService;
    }

    @GetMapping
    public List<Fault> getFaults() {
        return faultService.getAllFaults();
    }
}
