package Java_Programs;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String x = "abcdcba";
		
		int i=0, j = x.length()-1;
		while (i<j)
		{
		if (x.charAt(i)!= x.charAt(j))
		{
			System.out.println("Not a Palindrome");
			System.exit(0);
		}
		i++;
		j--;
		}
		System.out.println("Given String "+x+" is Palindrome");
	}
}


