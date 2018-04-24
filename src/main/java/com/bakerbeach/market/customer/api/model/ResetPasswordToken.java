package com.bakerbeach.market.customer.api.model;

import java.util.Date;

public interface ResetPasswordToken {

	String getId();

	void setId(String id);

	String getCustomerId();

	void setCustomerId(String customerId);

	Date getExpiresAt();

	void setExpiresAt(Date expiresAt);

	String getShop();

	void setShop(String shop);

}
