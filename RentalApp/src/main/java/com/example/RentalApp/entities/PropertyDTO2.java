package com.example.RentalApp.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class PropertyDTO2 {

	private String location;
	private Integer price;
	private String propertyType;
}
