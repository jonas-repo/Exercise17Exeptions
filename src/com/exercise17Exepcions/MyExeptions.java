package com.exercise17Exepcions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExeptions {

	public static void main(String[] args) {
		// variable declaration
		int[] numbers = {3,4,5,6,5,4,6,7,8,9};
		
		
		//objects 
		Scanner input = new Scanner(System.in);
		
		//get the error
		try 
		{
			
			System.out.println(numbers[0]);
			System.out.println(numbers[1]);
			System.out.println(numbers[11]);
			System.out.println(numbers[3]);
			System.out.println(numbers[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			
		}
		finally 
		{
			System.out.println("there was an error on the execution please check the line, this line is executed after the error");
		}
		
		
		for (int i = 0; i < 10; i++) 
		{
			try 			
			{
				System.out.println("Input a number between 9-10");
				numbers[i] = input.nextInt();
			}
			catch(InputMismatchException e) 
			{
				System.out.println("The input of number is wrong please verify");
				input.next(); //clear the buffer
				i--;
				
			}
			catch(NumberFormatException e)
			{
				System.out.println("The input of number is wrong please verify");
				input.next(); //clear the buffer
				i--;
			}
			
		}
		
	}

}
