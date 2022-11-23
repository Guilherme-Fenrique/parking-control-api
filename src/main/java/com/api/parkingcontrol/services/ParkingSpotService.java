package com.api.parkingcontrol.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {
	
	final ParkingSpotRepository parkingspotRepository;
	
	public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
		this.parkingspotRepository = parkingSpotRepository;
	}
	
	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		
		return parkingspotRepository.save(parkingSpotModel);
	}

	public boolean existsByLicensePlateCar(String licensePlateCar) {
		
		return parkingspotRepository.existsByLicensePlateCar(licensePlateCar);
	}

	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
		
		return parkingspotRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}

	public boolean existsByApartmentAndBlock(String apartment, String block) {
		
		return parkingspotRepository.existsByApartmentAndBlock(apartment, block) ;
	}

	public List<ParkingSpotModel> findAll() {
		
		return parkingspotRepository.findAll();
	}

	public Optional<ParkingSpotModel> findById(UUID id) {
	
		return parkingspotRepository.findById(id);
	}
	
	@Transactional
	public void delete(ParkingSpotModel parkingSpotModel) {
		parkingspotRepository.delete(parkingSpotModel);
				
	}

	
	  

}
