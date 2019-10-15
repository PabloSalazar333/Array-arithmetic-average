package com.homework1.app;

import java.util.Random;

public class Array_arithmetic_average {
	
	public static void main(String[]args) {
		// Constant declaration
		final int ELEMENTS_ARRAY = 100;
		
		//Array declaration
		byte[] vector = new byte[ELEMENTS_ARRAY];
		double sum = 0;
		double arithmeticAverage = 0.0;
		
		//Objective declaration
		Random randomNumbers = new Random(System.nanoTime());
				
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			vector[i] = (byte) (randomNumbers.nextInt(50)+51);
			sum += vector[i];
			System.out.println(vector[i]);
		}
		/*for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			System.out.println(vector[i]);
		}*/
			System.out.println(sum);
			
			arithmeticAverage = (double)(sum/ELEMENTS_ARRAY);
			
		System.out.println("The aritmetic averga is: "+arithmeticAverage);

	}

}
