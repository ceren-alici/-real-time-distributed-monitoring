package com.ceren.vehiclefaultsystem.repository;

import com.ceren.vehiclefaultsystem.model.Fault;
import org.springframework.data.jpa.repository.JpaRepository;

// REPOSITORY KATMANI:
// Bu interface Fault tablosu ile veritabanı işlemlerini yönetir.
public interface FaultRepository extends JpaRepository<Fault, Integer> {

}
