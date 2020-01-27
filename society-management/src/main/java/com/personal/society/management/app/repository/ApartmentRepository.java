package com.personal.society.management.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.personal.society.management.app.entity.Apartment;

public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {

	@Query(value = "select * from apartment where apartment_block = :apartmentBlock and apartment_no = :apartmentNo and society_id = :societyId", nativeQuery = true)
	Apartment findByApartmentBlockAndApartmentBlockAndSociety(@Param("apartmentBlock") String apartmentBlock,
			@Param("apartmentNo") String apartmentNo, @Param("societyId") Integer societyId);
}
