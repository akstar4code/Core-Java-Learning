package com.unquie;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo
{

	public static void main(String[] args)
	{
		/*
		Set<Integer> values = new HashSet<>();
		
		System.out.println(values.add(51));
		System.out.println(values.add(63));
		System.out.println(values.add(21));
		System.out.println(values.add(98));
		System.out.println(values.add(67)); //returns boolean
		
		for(int i: values)
		{
			System.out.println(i); //Sequence is not maintain
		}
		*/
		// Tree set in sequence
		Set<Integer> values = new TreeSet<>();
		
		System.out.println(values.add(51));
		System.out.println(values.add(63));
		System.out.println(values.add(21));
		System.out.println(values.add(98));
		System.out.println(values.add(67)); //returns boolean
		
		for(int i: values)
		{
			System.out.println(i); //Sequence is not maintain
		}
	}

}
