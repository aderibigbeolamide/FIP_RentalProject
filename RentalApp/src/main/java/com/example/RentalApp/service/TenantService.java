package com.example.RentalApp.service;

import com.example.RentalApp.entities.Tenant;
import com.example.RentalApp.entities.TenantDTO;
import com.example.RentalApp.exceptions.TenantException;

public interface TenantService {

	public Tenant registerAsTenant(Tenant tenant) throws TenantException;
	
	public Tenant getTenantById(Integer tenantid) throws TenantException;
	
	public Tenant updateTenant(Tenant tenant) throws TenantException;
	
	public Tenant deleteTenantById(Integer tenantid) throws TenantException;
}
