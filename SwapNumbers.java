package Java_Programs;

import java.util.Scanner;

public class SwapNumbers 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		//int x,y,temp;
		int x,y;
		System.out.println("Enter x and y");
		Scanner scan = new Scanner(System.in);
	
		x = scan.nextInt();
		y = scan.nextInt();
		System.out.println("Before Swpping\n = "+x+" \n = "+y);
		
		/*temp = x;
		x = y;
//		y = temp;  */
		
		x = x+y ;
		y = x-y ;
		x = x-y ;
		
		System.out.println("After Swapping\n x = "+x+"\n y = "+y);
		
	}
}
