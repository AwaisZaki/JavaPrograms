class imagin
{
	int img,real;
	
	public void display()
	
		{
			if(img < 0)
				{
					System.out.print("("+real+" + "+img+"i)");
				}
				
			else
				{
					System.out.print("("+real+" + "+img+")");
				}
				
				
		}
	
}

public class imaginary

{
	public static void main( String[] args)
	
	{
		imagin i = new imagin();
		
		i.img =  3;
		i.real = 4;
		i.display();
		
		i.img = -6;
		i.real = 8;
		i.display();
	}
}