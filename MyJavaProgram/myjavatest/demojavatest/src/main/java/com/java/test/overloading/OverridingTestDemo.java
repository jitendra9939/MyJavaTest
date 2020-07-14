package com.java.test.overloading;

class A {

	public void m(int a) {
		System.out.println("parent a");
	}

	public void m(int a, int b) {
		System.out.println("parent a+b");
	}

	public void m(int... a) {
		System.out.println("Parent ... a");
	}
}

class B extends A {
	public void m(int a) {
		System.out.println("child a");
	}
}

public class OverridingTestDemo {

	public static void main(String[] args) {
		B b = new B();
		b.m();
	}

}
