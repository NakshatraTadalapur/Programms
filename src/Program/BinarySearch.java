package Program;

public class BinarySearch {

	public static void main(String[] args) 
	{
	  int a[]= {1,5,4,8,9,2,3,6};
	  boolean status=false;
	  
	  int key=8;
	  int l=0;
	  int h=a.length-1;
	  
	  while(l<=h)
	  {
		  int m=(l+h)/2;
		  if(a[m]==key)
		  {
			  System.out.println("element found");
			  status=true;
			  break;
		  }
		  if(a[m]<key)
		  {
			  l=m+1;
		  }
		  if(a[m]>key)
		  {
			  h=m-1;
		  }
	  }
	  if(status==false)
	  {
		  System.out.println("element not found");
	  }

	}

}
