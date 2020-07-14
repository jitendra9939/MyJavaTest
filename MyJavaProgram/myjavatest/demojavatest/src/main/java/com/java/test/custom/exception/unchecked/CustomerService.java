package com.java.test.custom.exception.unchecked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {
	
	public void analyze(List<String> data) {
		if(data.size()>50)
		{
			throw new ListIsToLargeException("List size can not greater than 50!");
		}
	}

	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		
		List<String> myList=new ArrayList<String>(Collections.nCopies(60, "Test"));

		System.out.println("List Size= "+myList.size());
		
		customerService.analyze(myList);
	}

}
