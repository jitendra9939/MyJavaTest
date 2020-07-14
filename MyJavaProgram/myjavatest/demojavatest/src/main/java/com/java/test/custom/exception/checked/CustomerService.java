package com.java.test.custom.exception.checked;

public class CustomerService {

	public void findByName(String name) throws NameNotFoundException {
		if ("".equals(name)) {
			throw new NameNotFoundException("Name is not Empty");
		}
	}

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();

		try {
			customerService.findByName("");
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}

	}

}
