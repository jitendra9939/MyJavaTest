package org.demojavatest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };

		// 1st way
		for (int i = 0; i < names.length; i++) {
			// System.out.println("Value "+i+" ="+names[i]);
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate Value is= " + names[i]);
				}
			}
		}
		
		
		
		//2nd way
		
		Set set=new HashSet();
		for(String value:names)
		{
			if(set.add(value)==false)
			{
				System.out.println("Duplicate Value ="+value);
			}
		}
		
		
		//3rd way
		Map<String,Integer> map=new HashMap();
		for(String value:names)
		{
			Integer count=map.get(value);
			if(count ==null)
			{
				map.put(value, 1);
			}
			else
			{
				map.put(value, ++count);
			}
		}
		
		for(Entry entry:map.entrySet())
		{
			if((Integer) entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
			
		}

	}

}
