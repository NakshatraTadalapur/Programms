package Program;

public class SumElementsInArray {

	public static void main(String[] args) 
	{
	  // using for loop 
	/*	int a[]= {10,12,7,8,6};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
      System.out.println("sum of elements in an array:"+sum); */
		
	// using enhanced for loop	
		int a[]= {10,12,7,8,6};
		int sum=0;
		
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("sum of elements in an array:"+sum);
	}
	

}
