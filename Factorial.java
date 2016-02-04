public class Factorial
{

public static void main( String[] args)
{
		
		int num=4;
		int i=1;
		int facto=1;
		
		while(i<=num)
			
			{
				facto = facto*i;
				
				i++;
			}
			System.out.print("The Factorial of "+num+" is "+facto);
			
}

}