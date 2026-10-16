package com.ceren.vehiclefaultsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// SERVER CONTROLLER
// Sunucunun durumunu kontrol etmek için kullanılır.
@RestController
public class ServerController {

    // Sunucu çalışıyor mu?
    @GetMapping("/")
    public String home() {
        return "Vehicle Fault System Server is running.";
    }

    // Sağlık kontrolü (Health Check)
    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    // Sunucu durumu
    @GetMapping("/status")
    public String status() {
        return "Server Status : ONLINE";
    }

}getmapping