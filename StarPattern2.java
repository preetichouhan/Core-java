package com.kkm;
import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows:- ");
		
		int rows = sc.nextInt();
		
		for(int i = 1; i<=rows; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i<=4; i++)
		{
			for(int k = 4; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}

/*
*
* * 
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/