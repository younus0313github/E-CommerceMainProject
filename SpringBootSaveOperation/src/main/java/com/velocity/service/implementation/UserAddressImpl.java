package com.velocity.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.UserAddress;
import com.velocity.service.UserAddressService;
import com.velociy.repository.UserAddressRepository;

@Service
public class UserAddressImpl implements UserAddressService {

	@Autowired
	private UserAddressRepository userAddressRepository;

	@Override
	public UserAddress saveUserAddress(UserAddress useraddress) {

		UserAddress ua = userAddressRepository.save(useraddress);
		return ua;
	}

}
