package Program;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) 
	{
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the Number");
				
				int num = s.nextInt();
				
				switch(num%2)
				{
				case 0:
					System.out.println("even");
					break;
				case 1:
					System.out.println("odd");
					break;
				
				}
				System.out.println("****************");

				if(num%2==0)
				{
					System.out.println("even number");
				}
				else
				{
					System.out.println("odd number");
				}
			}

		

	}


