package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.UserAddress;
import com.example.service.UserAddressService;

@RestController
@RequestMapping(path = "/useraddress")
public class UserAddressController {

	// Inject the service here
	@Autowired
	private UserAddressService userAddressService;

	// Design the Restful web service to update user address

	@PutMapping("/update/{id}")
	public ResponseEntity<UserAddress> updateAddress(@RequestBody UserAddress userAddress,
			@PathVariable("id") Integer id) {
		UserAddress userAdds = userAddressService.updateUserAddress(userAddress, id);
		return ResponseEntity.ok().body(userAdds);
	}
}

