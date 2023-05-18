package Program;

public class EvenOddArray {

	public static void main(String[] args) 
	{
	  //using for loop
	/*	int a[]= {5,2,7,8,9};
		System.out.println("even numbers in array....:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("odd numbers in array....:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}   */
      
	// using enhanced for loop
		int a[]= {1,4,8,14,12,3};
		System.out.println("even numbers in array....:");
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
		System.out.println("odd numbers in array....:");
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
	}

 }
}
