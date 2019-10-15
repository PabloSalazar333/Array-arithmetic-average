package com.homework1.app;

import java.util.Random;

public class SumInverseArrays {

	public static void main(String[] args) {
		// Constant declaration
		final int ELEMENTS_ARRAY = 100;

		//Array declaration
		byte[] vector1 = new byte[ELEMENTS_ARRAY];
		byte[] vector2 = new byte[ELEMENTS_ARRAY];
		
		//Variable declaration
		int sum = 0;

		//Pass 1 Initialize
		Random randomNumbers = new Random(System.nanoTime());
		
		//Pass 2 Process
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			vector1[i] = (byte) randomNumbers.nextInt(101);
			System.out.println(vector1[i]);
			System.out.println(" ");

			for(int j=0; j<ELEMENTS_ARRAY; j++)
			{
				vector2[j] = (byte) randomNumbers.nextInt(101);
				System.out.println(vector2[j]);
				//System.out.println(" ");			

				sum = vector1[i]+vector2[j];
				System.out.println(sum);
			}

		}
		
	}

}
