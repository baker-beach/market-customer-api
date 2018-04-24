package com.bakerbeach.market.customer.api.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.bakerbeach.market.core.api.model.Customer;
import com.bakerbeach.market.customer.api.model.ResetPasswordToken;

public interface CustomerService {

	void update(Customer customer) throws CustomerServiceException;

	Customer findById(String customerId) throws CustomerServiceException;

	Map<String, Customer> findById(Collection<String> customerIdList) throws CustomerServiceException;

	Customer findByEmail(String email, String shopCode) throws CustomerServiceException;

	@Deprecated
	Customer register(String email, String password, String shopCode) throws CustomerServiceException;

	Customer register(String email, String password, List<String> shopCode) throws CustomerServiceException;

	Customer register(String email, String password, List<String> shopCode, String firstName, String lastName)
			throws CustomerServiceException;

	Boolean checkPassword(Customer customer, String password) throws CustomerServiceException;

	void changePassword(Customer customer, String newPassword) throws CustomerServiceException;

	void renewPassword(String email, String shopCode) throws CustomerServiceException;

	Customer createAnonymousCustomer();

	String createResetPasswordToken(String email, String shopCode) throws CustomerServiceException;

	ResetPasswordToken getResetPasswordToken(String tokenId) throws CustomerServiceException;

	void deleteResetPasswordToken(String id) throws CustomerServiceException;

}