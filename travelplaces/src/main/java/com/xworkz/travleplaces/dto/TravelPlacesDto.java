package com.xworkz.travleplaces.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TravelPlacesDto {

	private int id;
	private String placeName;
	private Long pinCode;

}
