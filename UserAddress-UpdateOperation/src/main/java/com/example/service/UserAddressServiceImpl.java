package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.model.UserAddress;
import com.example.repository.UserAddressRepository;

@Service
public class UserAddressServiceImpl implements UserAddressService {

	// inject repository reference
	@Autowired
	private UserAddressRepository userAddressRepository;

	@Override
	public UserAddress updateUserAddress(UserAddress userAddress, Integer id) {

		if (userAddressRepository.findById(id).isPresent()) {
			UserAddress userAdd = userAddressRepository.getById(id);
			userAdd.setUserAddress(userAddress.getUserAddress());
			userAdd.setUserId(userAddress.getUserId());
			userAdd.setConsignee(userAddress.getConsignee());
			userAdd.setPhoneNum(userAddress.getPhoneNum());
			userAdd.setIsDefault(userAddress.getIsDefault());

			UserAddress updatedAdd = userAddressRepository.save(userAdd);
			return updatedAdd;
		} else {
			return null;
		}
	}

}
