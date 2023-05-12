package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.UserAddress;
import com.velocity.service.UserAddressService;

@RestController
public class UserAddressController {
	@Autowired
	public UserAddressService userAddressService;

	@PostMapping("/saveUserAddress")
	public ResponseEntity<UserAddress> saveUserAddress(@RequestBody UserAddress userAddress) {
		UserAddress uadd = userAddressService.saveUserAddress(userAddress);
		return ResponseEntity.ok().body(uadd);

	}

}
