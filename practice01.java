package exceptionHandling;

import java.util.Arrays;

public class practice01 {
	public static void main(String[] args) {


		int a=10;
		int b=0;
		int res=0;
		System.out.println("program Start");

		try 
		{
			res=a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
			System.out.println(ae.getMessage());
			System.out.println(Arrays.toString(ae.getStackTrace()));
			//ae.printStackTrace();
			

		}
		finally
		{
			System.out.println("Finally block");
		}

		System.out.println("output is:"+res);
		System.out.println("program End");
	}
}
