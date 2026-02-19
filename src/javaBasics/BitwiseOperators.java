package javaBasics;

import java.util.Arrays;

public class BitwiseOperators {
	public static void main(String args[]) {
		int a = 10;   // binary representation 1010  
		int b = 5;     // binary representation 0101  
		// a | b = 1010 | 0101 = 1111  
		// the value of 1111 in decimal representation is 15  
		System.out.println("The value of a | b is: " + (a | b)); 
		// a & b = 1010 & 0101 = 0000 
		System.out.println("The value of a | b is: " + (a & b));
		// a ^ b = 1010 ^ 0101 = 1111   
		System.out.println("The value of a | b is: " + (a ^ b)); 
		// ~a = 1010 which will be represented as 10 in decimal format   
		System.out.println("The value of a | b is: " + ~a);
		//Java Ternary operator is used as one line replacement for if-then-else statement and used a lot 
		//in Java programming. It is the only conditional operator which takes three operands.
		int min=(a<b)?a:b;      
		System.out.println(min); 
		int[] arr =  new int[4];
		arr[0]=1;
		Arrays.toString(arr);
	}
	
}
