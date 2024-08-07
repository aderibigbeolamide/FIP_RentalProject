package com.example.RentalApp.service;

import java.util.List;

import com.example.RentalApp.entities.Property;
import com.example.RentalApp.entities.PropertyDTO;
import com.example.RentalApp.entities.PropertyDTO2;
import com.example.RentalApp.exceptions.LandLordException;
import com.example.RentalApp.exceptions.PropertyException;

public interface PropertyService {

	public Property addPropertyWithoutLandLord(PropertyDTO2 prt) throws PropertyException;
	
	public Property addPropertyWithLandLord(PropertyDTO prt) throws PropertyException;
	
	public List<Property> getAllPropetyOfALandLord(Integer landlordId) throws LandLordException;
	
	public List<Property> searchPropertyBasedOnLocation(String location) throws PropertyException;
	
	public Property getPropertyById(Integer propertyID) throws PropertyException;
	
	public List<Property> getAllProperties() throws PropertyException;
	
	public List<Property> getSortedPropertyListWithField(String field, String direction);
	
	public Property deleteProperty(Integer pid) throws PropertyException;
}
