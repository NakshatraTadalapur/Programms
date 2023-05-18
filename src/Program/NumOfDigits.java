package Program;

public class NumOfDigits {

	public static void main(String[] args) 
	{
	  int num = 584961;
	  int count = 0;
	  
	  while(num>0)
	  {
		  num=num/10;
		  count++;
	  }
	  System.out.println("number of digits in a given numbeer:" + count);
	}

}
