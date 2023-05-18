package Program;

import java.util.Scanner;

public class ReversNum {

	public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		
  // using algorithm
	/*int rev = 0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
        System.out.println("reverse of the given num is:"+rev);  */
		
  // using string builder cls
	/*StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("reverse of the given num is:"+rev); */
		
  // using stringbuffer cls
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("reverse of the given num is:"+rev);
	}

}
