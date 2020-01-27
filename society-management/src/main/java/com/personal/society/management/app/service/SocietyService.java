package com.personal.society.management.app.service;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.society.management.app.domain.Apartment;
import com.personal.society.management.app.domain.Society;
import com.personal.society.management.app.repository.ApartmentRepository;
import com.personal.society.management.app.repository.SocietyRepository;

@Service
public class SocietyService {

	@Autowired
	SocietyRepository societyRepository;

	@Autowired
	ApartmentRepository apartmentRepository;

	public void register(Society society) {
		com.personal.society.management.app.entity.Society societyEntity = societyRepository
				.findBySocietyKey(society.getSocietyKey());

		if (Objects.isNull(societyEntity)) {
			societyEntity = new com.personal.society.management.app.entity.Society();
		}
		BeanUtils.copyProperties(society, societyEntity);
		societyRepository.save(societyEntity);
	}

	public void registerApartments(Set<Apartment> apartments) {
		for (Apartment a : apartments) {
			Integer societyId = -1;
			com.personal.society.management.app.entity.Society society = societyRepository
					.findBySocietyKey(a.getSocietyKey());
			
			if(Objects.nonNull(society)) {
				societyId = society.getSocietyId();
			}
			com.personal.society.management.app.entity.Apartment apartmentEntity = apartmentRepository
					.findByApartmentBlockAndApartmentBlockAndSociety(a.getBlock(), a.getApartmentNo(), societyId);
			if (Objects.nonNull(apartmentEntity)) {
				apartmentRepository.delete(apartmentEntity);
			}
		}

		List<com.personal.society.management.app.entity.Apartment> apartmentEntities = apartments.stream()
				.map(a -> new com.personal.society.management.app.entity.Apartment(a.getBlock(), a.getApartmentNo(),
						societyRepository.findBySocietyKey(a.getSocietyKey())))
				.collect(Collectors.toList());

		apartmentRepository.saveAll(apartmentEntities);
	}
}
