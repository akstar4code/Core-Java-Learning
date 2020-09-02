package com.unquie;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInputException {

	public static void main(String[] args) throws Exception
	{
		int n = 0;
		System.out.println("Enter a Number : ");
		//Close the resources automatically
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			n = Integer.parseInt(br.readLine());
		}
		/*
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		}
		
		finally
		{
			br.close();
			System.out.println("Closed");
		}
		*/
		System.out.println(n);
	}

}
