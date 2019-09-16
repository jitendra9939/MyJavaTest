package org.demojavatest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortStringDemoFour {

	public static void main(String[] args) {
		String input = "Agsa2aXsdh34";
		String sorted = sort(input);
		count(input);
		// countandsort(sorted);
		System.out.println("Sorted String>>>> " + sorted);
		// TODO Auto-generated method stub

	}

	public static void countandsort(String sorted) {
		char[] charArray = sorted.toCharArray();
		Character temp = null;
		Character temp1 = null;
		for (int i = 0; i < charArray.length; i++) {
			int count = 0;
			for (int j = i; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					count++;
					temp1 = charArray[1];
				}
			}
			temp = charArray[i];
			if (temp != temp1)
				System.out.println(charArray[i] + " <<< " + count);
		}

	}

	public static void count(String input) {
		char[] charArray = input.toCharArray();
		Map<Character, Integer> hsHashMap = new TreeMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (hsHashMap.containsKey(charArray[i])) 
			{
				hsHashMap.put(charArray[i], hsHashMap.get(charArray[i]) + 1);
			} else {
				hsHashMap.put(charArray[i], 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : hsHashMap.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		String result = sb.toString();
		System.out.println("Count repated value " + result);
	}

	public static void countSecond(String input) {
		char[] charArray = input.toCharArray();
		int[][] result = new int[charArray.length][1];

		for (int index=0; index< charArray.length; index++) {
			 char c = charArray[index];
			if (Arrays.binarySearch(result[index], (int) c) == 0) {
				result[index][1] = result[index][1] +1;
			}else {
				result[index][0] =(int) c;
				result[index][1] = 1;
			}
		}

	}

	public static String sort(String input) {
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i; j < charArray.length; j++) 
			{
				if (Character.toLowerCase(charArray[j]) <= Character.toLowerCase(charArray[i])) {
					swap(i, j, charArray);
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		Set<String> set = new HashSet<String>();

		for (int i = 0; i < charArray.length; i++) {
			int count = 0;
			for (int j = i; j < charArray.length; j++) 
			{
				if(charArray[i]==charArray[i])
				count++;
				set.add(String.valueOf(charArray[i]));
			}
			System.out.println("value>> " + String.valueOf(charArray[i]) + "  count>> " + count);
		}
		System.out.println(set);
		return String.valueOf(charArray);
	}

	public static void swap(int i, int j, char[] charArray) {
		char tmp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = tmp;
	}
}
