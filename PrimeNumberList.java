package Java_Programs;

public class PrimeNumberList 
{

	public static void main(String[] args) 
	{
		for(int n=1; n<= 100; n++)
		{
			int count =0;
			
			for(int i=2; i<=n-1; i++)
			{
				if (n%i == 0)
				{
				count = count+1;
				}
			}
			if (count ==0)
			{
				System.out.println(n);
			}
		}
		
	}
}
