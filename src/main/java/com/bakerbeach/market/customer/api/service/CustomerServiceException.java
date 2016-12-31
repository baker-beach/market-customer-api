package com.bakerbeach.market.customer.api.service;

import com.bakerbeach.market.core.api.model.Text;

@SuppressWarnings("serial")
public class CustomerServiceException extends Exception{
	
	private Text text;
	
	public Text getText(){
		return text;
	}
	
	public void setText(Text text){
		this.text = text;;
	}
	
	public CustomerServiceException(Text text){
		this.text = text;
	}
	
	public CustomerServiceException(Exception e){
		super(e);
	}
	
	public static class CustomerNotFoundException extends CustomerServiceException{
		
		public CustomerNotFoundException(Exception e) {
			super(e);
		}
		
		public CustomerNotFoundException(Text text) {
			super(text);
		}
		
	}

}
