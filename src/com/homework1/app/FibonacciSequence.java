package com.homework1.app;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) 
	{
		// Constant declaration
		
		//Variable declaration
		int cont1 = 0;
		int cont2 = 1;
		long fibonacci = 1;
		int bound = 0;
		
		Scanner input = new Scanner(System.in);

		do
		{
			System.out.print("How many fibonaccis wish calculate: ");
			bound = input.nextInt();
			
			if(bound<=0) 
			{
				System.out.println("You must enter a value greater than 0 ");
			}
			
		}while(bound<=0);
		for(int i=0; i<bound;i++) 
		{
			System.out.print(fibonacci+" ");
			fibonacci = cont1 + cont2;
			cont1 = cont2;
			cont2 = (int) fibonacci;
		}
		
		input.close();
		
	}

}
