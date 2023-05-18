package Program;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int a[]= {10,24,58,78,69};
		int search_ele=10;
		
		boolean status=false;
		for(int i=0;i<a.length;i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("element found :"+i);
				status=true;
				break;
			}
				
		}
		if(status==false)
		{
			System.out.println("element not found" );
		}

	}

}
