package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.repository.UserAddressRepository;
import com.velocity.service.UserAddressService;

@RestController
public class UserAddressController {

	@Autowired
	private UserAddressService userAddressService;

	@DeleteMapping("/delete/{id}")
	public void deleteUserAddressByid(@PathVariable("id") Integer id) throws Exception {
		userAddressService.deleteUserAddress(id);

	}
}