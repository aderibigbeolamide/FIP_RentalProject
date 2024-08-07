package com.example.RentalApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentalApp.entities.LandLord;
import com.example.RentalApp.entities.LandLordDTO;
import com.example.RentalApp.entities.Property;
import com.example.RentalApp.exceptions.LandLordException;
import com.example.RentalApp.exceptions.PropertyException;
import com.example.RentalApp.repository.LandLordRepository;
import com.example.RentalApp.repository.PropertyRepository;

@Service
public class LandLordImpl implements LandLordService {
	
	@Autowired
	private LandLordRepository lrep;
	
	@Autowired
	private PropertyRepository prep;

	@Override
	public LandLord addLandLord(LandLord ld) throws LandLordException {
		
		return lrep.save(ld);
	}

	@Override
	public LandLord getLandLordByID(Integer landlordId) throws LandLordException {
		Optional<LandLord> opt=lrep.findById(landlordId);
		if(opt.isPresent()) {
			return opt.get();
		}
		throw new LandLordException("LandLord with id: "+landlordId+" not found");
	}

	@Override
	public List<LandLord> getAllLandLord() throws LandLordException {
		List<LandLord> li=lrep.findAll();
		if(li.size()==0) {
			throw new LandLordException("There are no landlords");
		}
		return li;
	}

	@Override
	public LandLord addLandLordWithProperty(LandLord ld, Integer propertyID)
			throws LandLordException, PropertyException {
		Optional<Property> opt=prep.findById(propertyID);
		if(opt.isEmpty()) {
			throw new PropertyException("There are no property by id: "+propertyID);
		}
		Property p=opt.get();
		ld.getProperties().add(p);
		return lrep.save(ld);
	}

	@Override
	public LandLord deleteLandLord(Integer landlordId) throws LandLordException {
		Optional<LandLord> opt=lrep.findById(landlordId);
		if(opt.isPresent()) {
			LandLord l=opt.get();
			lrep.delete(l);
			return l;
		}
		throw new LandLordException("LandLord with id: "+landlordId+" not found");
	}

}
