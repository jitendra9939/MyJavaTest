package org.demojavatest;

public class PrintSubArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		printSubset(a);

	}
	
	public static void printSubset(int a[])
	{
		int lenght=a.length;
		
		for(int i=0;i<lenght;i++)
		{
			for(int j=i;j<lenght;j++)
			{
				for(int k=i; k<=j;k++)
				{
					System.out.println(a[i]);
				}
				System.out.println();
			}
		}
	}

}
