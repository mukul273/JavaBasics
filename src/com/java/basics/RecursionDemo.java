package com.java.basics;

/**
 * Recursive demo
 * @author msamak
 *
 */
public class RecursionDemo {
	
	public static void main(String args[]) {
		 // E.g. 4! = 4*3*2*1 (factorial 4)
        System.out.println(factorial(5));
    }
     
    private static int factorial(int value) {
         
        if(value == 1) {
            return 1;
        }
         
        return factorial(value - 1) * value;
    }
}