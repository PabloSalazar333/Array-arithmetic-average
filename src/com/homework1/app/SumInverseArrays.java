package com.homework1.app;

import java.util.Random;

public class SumInverseArrays {

	public static void main (String[] args) {
		// Constant declaration
		final int ELEMENTS_ARRAY = 100;

		//Array declaration
		byte[] vector1 = new byte[ELEMENTS_ARRAY];
		byte[] vector2 = new byte[ELEMENTS_ARRAY];
		
		//Variable declaration
		int sum = 0;
		int count = 99;

		//Pass 1 Initialize
		Random randomNumbers = new Random(System.nanoTime());
		
		//Pass 2 Process
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			vector1[i] = (byte) randomNumbers.nextInt(100);
			System.out.println(vector1[i]);
		}
		
		System.out.println(" ");
		
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			vector2[i] = (byte) randomNumbers.nextInt(100);
			System.out.println(vector2[i]);
		
		}
		
		System.out.println("");
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			sum = vector1[i]+vector2[count];
			System.out.println(sum);	
			count --;
		}
		
		
		
	}

}
