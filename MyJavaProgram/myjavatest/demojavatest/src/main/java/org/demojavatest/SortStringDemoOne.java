package org.demojavatest;

import java.util.Arrays;

public class SortStringDemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString="sjfbsdjbfsdjfbgdfdhfg";
		String sortedString =sort(myString);
		System.out.println("Before Sort : <" +myString +"> After Sort :<" +sortedString+">");

	}
	
	public static String sort(String source)
	{
		char tmpArray[]=source.toCharArray();
		
		Arrays.sort(tmpArray);
		return new String(tmpArray);
	}

}
