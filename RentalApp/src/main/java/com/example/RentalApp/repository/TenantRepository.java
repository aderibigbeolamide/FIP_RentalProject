package com.example.RentalApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RentalApp.entities.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Integer> {

	public Optional<Tenant> findByEmail(String email);
}
