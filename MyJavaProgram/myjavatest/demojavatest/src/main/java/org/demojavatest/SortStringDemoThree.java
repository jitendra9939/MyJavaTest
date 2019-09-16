package org.demojavatest;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringDemoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "dhfjdsHHVGHD023889873728473sdfsdhvVHDVHDV";
		String sortedString = sort(myString);
		System.out.println("Before Sort : <" + myString + "> After Sort :<" + sortedString + ">");

	}

	public static String sort(String source) {
		char[] charArray = source.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) {
					swapCharacter(i, j, charArray);
				}
			}
		}
		return String.valueOf(charArray);
	}

	public static void swapCharacter(int i, int j, char[] charArray) {
		char tmp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = tmp;
	}

}
