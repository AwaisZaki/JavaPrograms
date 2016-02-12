public class FibonacciSeries
{
	public static void main( String[] args)
	
	{
		int first	=	Integer.parseInt(args[0]);
		int second	=	Integer.parseInt(args[1]);
		int limit	=	Integer.parseInt(args[2]); 
		int sum=0;
		
		
		System.out.println("\nFirst = "+first+" Second = "+second+" limit = "+limit+" \n");
		
		System.out.print("\n"+first+"\t"+second);
			
			while(sum < limit)
			
				{
				
				 sum = first+second;
				 first = second;
				 second = sum;
				 System.out.print("\t"+ sum);
			
				}
					limit++;
		
	}
}

		
		
		