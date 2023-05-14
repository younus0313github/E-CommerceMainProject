package com.velocity.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.UserAddress;
import com.velocity.repository.UserAddressRepository;
import com.velocity.service.UserAddressService;

@Service
public class UserAddressImpl implements UserAddressService {

	@Autowired
	private UserAddressRepository userAddressRepository;

	@Override
	public void deleteUserAddress(Integer id) {
		userAddressRepository.deleteById(id);
		//return useradd;
	}

	

}
