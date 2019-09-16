package org.demojavatest;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "345435AhdjhGDJHyX4234032423";
		String sortedString = sort(myString);
		System.out.println("Before Sort : <" + myString + "> After Sort :<" + sortedString + ">");

	}

	public static String sort(String source) {
		Character[] tmpArray = new Character[source.length()];

		for (int i = 0; i < source.length(); i++) {
			tmpArray[i] = source.charAt(i);
			System.out.println("Character " + tmpArray[i]);
		}

		Arrays.sort(tmpArray, new Comparator<Character>() {

			public int compare(Character c1, Character c2) {
				return Character.compare(Character.toLowerCase(c1), Character.toLowerCase(c2));
			}
		});
		
		StringBuffer sb=new StringBuffer();
		for (Character c:tmpArray)
		{
			sb.append(c);
		}
		return sb.toString();
	}

}
