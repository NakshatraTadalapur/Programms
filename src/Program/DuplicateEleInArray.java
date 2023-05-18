package Program;

import java.util.HashSet;

public class DuplicateEleInArray {

	public static void main(String[] args) 
	{
	 /* String a []= {"java","selenium","Java","Selenium","java"};
	  
	  boolean status=false;
	  
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]==a[j])
			  {
				  System.out.println("duplicate ele found:"+a[i]);
				  status=true;
			  }
		  }
	  }
	  if(status==false)
	  {
		  System.out.println("duplicate ele not found");
	  }  */
        
		String a[]= {"java","Java","selenium","Selenium"};
		HashSet <String>lan = new HashSet();
		boolean state=false;
		
		for(String l:a)
		{
			if(lan.add(l)==false)
				
			{
				System.out.println("duplicate element found:"+l);
				state=true;
			}
		}
		if(state==false)
		{
			System.out.println("duplicate element not found");
		}			
		
	}  

}
