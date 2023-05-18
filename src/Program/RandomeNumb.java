package Program;

import java.util.Random;

public class RandomeNumb {

	public static void main(String[] args) 
	{
		Random ram = new Random();
		int randomval = ram.nextInt(500);
		System.out.println(randomval);

	}

}
