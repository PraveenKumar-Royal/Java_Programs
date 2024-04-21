package Java_Programs;

import java.util.Scanner;

public class LeapYear 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int year;
		System.out.println("Enter year");
		
		 year = input.nextInt();
		
		if ((year%400 == 0) || (year%4 == 0 && year%100!=0))
		{
			System.out.println("Leap year");
		}
		else 
		{
			System.out.println("Not a Leap Year");
		}
	
	}
}
