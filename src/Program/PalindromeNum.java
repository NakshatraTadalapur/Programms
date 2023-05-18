package Program;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=Sc.nextInt();
		int org_num=num;
		
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num /10;
		}
		if(org_num==num)
		{
			System.out.println(org_num + "palindrome number");
		}
		else
		{
			System.out.println(org_num + "not palindrome number");
		}

	}

}
