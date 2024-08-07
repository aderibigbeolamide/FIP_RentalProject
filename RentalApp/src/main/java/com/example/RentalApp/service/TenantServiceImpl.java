package com.example.RentalApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentalApp.entities.Tenant;
import com.example.RentalApp.entities.TenantDTO;
import com.example.RentalApp.exceptions.TenantException;
import com.example.RentalApp.repository.TenantRepository;

@Service
public class TenantServiceImpl implements TenantService {
	
	@Autowired
	private TenantRepository trep;

	@Override
	public Tenant registerAsTenant(Tenant tenant) throws TenantException {
		
		return trep.save(tenant);
	}

	@Override
	public Tenant getTenantById(Integer tenantid) throws TenantException {
		Optional<Tenant> opt=trep.findById(tenantid);
		if(opt.isPresent()) {
			return opt.get();
		}
		throw new TenantException("There are no tenant by Id: "+tenantid);
	}

	@Override
	public Tenant updateTenant(Tenant tenant) throws TenantException {
		Optional<Tenant> opt=trep.findById(tenant.getTid());
		if(opt.isPresent()) {
			return trep.save(tenant);
			
		}
		throw new TenantException("There are no tenant by Id: "+tenant.getTid());
	}

	@Override
	public Tenant deleteTenantById(Integer tenantid) throws TenantException {
		Optional<Tenant> opt=trep.findById(tenantid);
		if(opt.isPresent()) {
			Tenant t=opt.get();
			trep.delete(t);
			return t;
		}
		throw new TenantException("There are no tenant by Id: "+tenantid);
	}

}
