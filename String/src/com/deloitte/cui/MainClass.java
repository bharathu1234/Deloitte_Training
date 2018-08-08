package com.deloitte.cui;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class MainClass {
	
	public static void main(String[] args) {
		String str1 = new String();
		String str2 = new String();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		str1 = sc.nextLine();
		
		System.out.println("Hello " + str1 + " ");
		
		System.out.println("Would you like to play a game? Y/N \n");
		
		str2 = sc.nextLine();
		
		
		if(str2.equals("Y")) {
			
			System.out.println("Okay! Welcome to the game realm! \n");
			System.out.println("What is the answer to life?");
			
			str2 = sc.nextLine();
			
			if(str2.equals("42")) {
				
				System.out.println("Great job! Looks like you have it all figured out!");
			}
			else {
				
				System.out.println("That's incorrect! Guess it's a sad life for you!");
			}
		}
		
		else {
			
			System.out.println("Okay! See you later!");
		}
		
		
		
	}

}
