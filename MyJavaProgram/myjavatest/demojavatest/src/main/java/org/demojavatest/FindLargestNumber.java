package org.demojavatest;

import java.util.Arrays;

public class FindLargestNumber {

	public static void main(String[] args) 
	{
		Integer[] array= {23,98,98,3,98,32,45,5,65,5,76,48,5,86,98,5};
		
		Integer myNumber=findNumber(array,2);
		System.out.println("Largest Number ::: "+myNumber);
		System.out.println("Array "+Arrays.toString(array));
	}
	
	public static int findNumber(Integer[] array,int path) {
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]==array[i])
				{
					System.out.println("Dulpicate "+array[i]);
				}
//				else if(array[j]>array[i])
//				{
//					int temp=array[i];
//					array[i]=array[j];
//					array[j]=temp;
//				}
			}
		}
		return array[path-1];
	}
	
}
