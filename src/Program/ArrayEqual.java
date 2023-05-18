package Program;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) 
	{
		int a1[]= {4,5,8,1,9,6};
		int a2[]= {4,8,5,9,6,1};
        boolean status = Arrays.equals(a1,a2);
        if(status==true)
        {
        	System.out.println("Arrays is equal");
        }
        else
        {
        	System.out.println("Arrays is not equal");
        }
	}

}
