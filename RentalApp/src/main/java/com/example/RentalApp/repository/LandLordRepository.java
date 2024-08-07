package com.example.RentalApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RentalApp.entities.LandLord;

@Repository
public interface LandLordRepository extends JpaRepository<LandLord, Integer> {

}
