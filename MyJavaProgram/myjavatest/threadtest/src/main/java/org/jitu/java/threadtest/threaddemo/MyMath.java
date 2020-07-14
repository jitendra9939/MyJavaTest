package org.jitu.java.threadtest.threaddemo;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.Future;

public class MyMath {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 final int x=10;
		 final int y=20;
		
		ExecutorService executor= Executors.newFixedThreadPool(1);
		
		Future<Integer> future=executor.submit(new Callable<Integer>() {
			public Integer call()
			{
				return Calculation.add(x,y);
			}
		});
		
		while(!future.isDone())
			Thread.yield();
		
		int result=future.get();
		
		System.out.println("Result  "+result);
	}
}

class Calculation
{
	public static int add(int a, int b)
	{
		return a+b;
	}
}