package com.personal.society.management.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.society.management.app.domain.User;
import com.personal.society.management.app.entity.Apartment;
import com.personal.society.management.app.repository.ApartmentRepository;
import com.personal.society.management.app.repository.SocietyRepository;
import com.personal.society.management.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ApartmentRepository apartmentRepository;
	
	@Autowired
	SocietyRepository societyRepository;

	public List<User> getUsersList() {
		List<com.personal.society.management.app.entity.User> l = userRepository.findAll();
		List<com.personal.society.management.app.domain.User> list = new ArrayList<>();
		for(com.personal.society.management.app.entity.User u : l) {
			User user = new User();
			BeanUtils.copyProperties(u, user);
			Apartment apartment = u.getApartment();
			user.setSocietyKey(apartment.getSociety().getSocietyKey());
			user.setApartmentNo(apartment.getApartmentNo());
			user.setBlock(apartment.getApartmentBlock());
			list.add(user);
		}
		return list;
	}

	public void addUser(User u) {
		com.personal.society.management.app.entity.User user = new com.personal.society.management.app.entity.User();
		BeanUtils.copyProperties(u, user);
		//Integer societyId = societyRepository.findBySocietyKey(u.getSocietyKey()).getSocietyId();
		user.setApartment(apartmentRepository.findByApartmentBlockAndApartmentBlockAndSociety
				(u.getBlock(), u.getApartmentNo(), societyRepository.findBySocietyKey(u.getSocietyKey()).getSocietyId()));
		
		userRepository.save(user);
	}

	public void updateUser(User u, int userId) {
		com.personal.society.management.app.entity.User user = new com.personal.society.management.app.entity.User();
		BeanUtils.copyProperties(u, user);
		user.setUserId(userId);
		//Integer societyId = societyRepository.findBySocietyKey(u.getSocietyKey()).getSocietyId();
		user.setApartment(apartmentRepository.findByApartmentBlockAndApartmentBlockAndSociety
				(u.getBlock(), u.getApartmentNo(), societyRepository.findBySocietyKey(u.getSocietyKey()).getSocietyId()));
		
		userRepository.save(user);
	}

	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
}
