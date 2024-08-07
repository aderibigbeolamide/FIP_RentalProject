package com.example.RentalApp.service;

import java.util.List;

import com.example.RentalApp.entities.LandLord;
import com.example.RentalApp.entities.LandLordDTO;
import com.example.RentalApp.exceptions.LandLordException;
import com.example.RentalApp.exceptions.PropertyException;

public interface LandLordService {

	public LandLord addLandLord(LandLord ld) throws LandLordException;
	
	public LandLord addLandLordWithProperty(LandLord ld,Integer propertyID) throws LandLordException,PropertyException;
	
	public LandLord getLandLordByID(Integer landlordId) throws LandLordException;
	
	public List<LandLord> getAllLandLord() throws LandLordException;
	
	public LandLord deleteLandLord(Integer landlordId) throws LandLordException;
}
