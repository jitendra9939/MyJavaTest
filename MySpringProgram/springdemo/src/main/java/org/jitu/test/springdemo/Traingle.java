package org.jitu.test.springdemo;

import java.util.ArrayList;
import java.util.List;

public class Traingle {

	List<Point> points;

	private Point pointA;
	private Point pointB;
	private Point pointC;

//	private String type;
//	private int height;
//
//	public Traingle(String type) {
//		this.type = type;
//	}
//
//	public Traingle(int height) {
//		this.height = height;
//	}
//
//	public Traingle(int height, String type) {
//		this.type = type;
//		this.height = height;
//	}
//
//	public int getHeight() {
//		return height;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}

	

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
//		for (Point ponit : points) {
//			System.out.println("Point  = (" + ponit.getX() + "," + ponit.getY() + ")");
//		}
		System.out.println("Point A = (" + pointA.getX() + "," + pointA.getY() + ")");
		System.out.println("Point A = (" + pointB.getX() + "," + pointB.getY() + ")");
		System.out.println("Point A = (" + pointC.getX() + "," + pointC.getY() + ")");
	}

}
