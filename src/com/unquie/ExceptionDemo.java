package com.unquie;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int arr[] = new int[10];
			arr[10] = 15;
			int i = 9/2;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Error ");
		}
		finally {
			System.out.println(" Bye ");
		}
	}
}
