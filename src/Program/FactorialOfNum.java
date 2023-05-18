package Program;

public class FactorialOfNum {

	public static void main(String[] args) 
	{
		// Ascending order
	/*	int num=8;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of given number:"+fact); */
		
	  // descending order
		int num=6;
		int fact=1;
		
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of given number:"+fact);
	}

}
