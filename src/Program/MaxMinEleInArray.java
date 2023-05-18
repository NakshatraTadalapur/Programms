package Program;

public class MaxMinEleInArray {

	public static void main(String[] args) 
	{
	  int a[]= {40,10,58,15,26};
	  int max=a[0];
	  
	  for(int i=1;i<a.length;i++)
	  {
		  if(a[i]>max)
		  {
			  max=a[i];
		  }
	  }
	  System.out.println("max element in an array:"+max);  
	  
	  
	 int b[]= {40,10,58,15,26};
	  int min=b[0];
	  
	  for(int i=1;i<b.length;i++)
	  {
		  if(b[i]<min)
		  {
			  min=b[i];
		  }
	  }  

	
	System.out.println("min element in an array:"+min); 
	}

}
