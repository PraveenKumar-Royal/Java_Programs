package Java_Programs;

public class ReverseAString 
{

	public static void main(String[] args) 
	{
	
		String str = "Praveen";
		
		for(int i= str.length()-1 ; i>=0 ; i--)
		{
			System.out.print(str.charAt(i));      // It returns the character at specified index.   
		}
//			System.out.println(str.length());       // It prints length i.e., number of characters  
	
	}
}


