package com.deloitte.cui;

public class Pointer {
	
	public static void main(String[] args) {
		
		Point p1,p2;
		int x,y;
		
		
		
		x = 10;
		
		y = x;
		
		System.out.println(x + " " + y);
		System.out.print("\n");
		
		y = 20;
		System.out.println(x + " " + y);
		System.out.print("\n");
		p1 = new Point();
		
		p1.x = 10;
		p1.y = 20;
		
		System.out.print(p1.x);
		System.out.print(" ");
		System.out.print(p1.y);
		System.out.print("\n");
		
		p2 = new Point();
		
		p2 = p1;
		
		p2.x = 80;
		p2.y = 90;
		
		System.out.print(p1.x);
		System.out.print(" ");
		System.out.print(p1.y);
		System.out.print("\n");
		
		
		p1.x = 50;
		p1.y = 100;
		
		System.out.print(p2.x);
		System.out.print(" ");
		System.out.print(p2.y);
		
		System.out.print("\n");
		
		System.out.print("p1 Address: " + p1);
		System.out.print("\n");
		System.out.print("p2 Address: " + p2);
		System.out.print("\n");
		p1 = new Point();
		
		System.out.print("p1 Address: " + p1);
		System.out.print("\n");
		System.out.print("p2 Address: " + p2);
		System.out.print("\n");

		
	}
	
}
