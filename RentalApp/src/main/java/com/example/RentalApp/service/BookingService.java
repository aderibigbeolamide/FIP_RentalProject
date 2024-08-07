package com.example.RentalApp.service;

import java.util.List;

import com.example.RentalApp.entities.Booking;
import com.example.RentalApp.entities.BookingDTO;
import com.example.RentalApp.exceptions.BookingException;
import com.example.RentalApp.exceptions.PropertyException;
import com.example.RentalApp.exceptions.TenantException;

public interface BookingService {

	public Booking makeABooking(BookingDTO bkg) throws BookingException,TenantException,PropertyException;
	
	public Booking getBookingDetails(Integer bkingID) throws BookingException;
	
	public Booking cancelBookingById(Integer bkingID) throws BookingException;
	
	public List<Booking> getAllBookingsOfAProperty(Integer pId) throws BookingException;
	
	public List<Booking> getAllBookings() throws BookingException;
	
}
