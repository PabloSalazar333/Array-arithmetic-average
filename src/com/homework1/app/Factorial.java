package com.homework1.app;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// Constant declaration
		
		//Variable declaration
		long factorial = 1;
		int number=-1;
		
		//Object declaration
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.print("Give me a number to calculate Factorial: ");
			number = input.nextInt();
			if(number<=0)
			{
				System.out.println("You most input a positive value");
			}
			
		}while(number<=0);
		
		factorial =GiveFactorial(number);
		System.out.println("The factorial of "+ number+" is: "+factorial+",\nwhich is gotten by multiplying several times "+number);
		input.close();

	}
	public static long GiveFactorial(int number)
	{
		int factorial=1;
		for(int i=1; i<=number;i++)
		{
			factorial=factorial*i;
		}
		return factorial;
	}

}
