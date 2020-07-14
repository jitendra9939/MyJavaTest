package org.demojavatest;

public class TestImpl extends Test {

	
	public static void main(String[] args) {
		TestImpl test=new TestImpl();
		test.printMessage("abc");
	}
	
	public void printMessage(String test) {
		System.out.println("child");
		printMessage();
	}

}
