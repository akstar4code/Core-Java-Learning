package com.unquie;

import java.util.ArrayList;
import java.util.Collection; // no indexing
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// t compare the object
class Stud implements Comparable<Stud>
{
	int rollno,marks;
	String name;
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	public Stud(int rollno, String name,  int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	 public int compareTo(Stud s) {
		 //return name.length()>s.name.length()?1:-1;
		 return marks>s.marks?1:-1;
	 }
}


public class CollectionsGenerics
{

	public static void main(String[] args)
	{
		/*
		// Collections interface
		Collection values = new ArrayList();
		values.add(4);
		values.add(9);
		values.add("Hello");
		
		Iterator it = values.iterator(); //Iterating in collections
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		/*
		// List interface (object) 
		List values = new ArrayList();
		values.add(4);  // Integer Wrapper class
		values.add(9);
		values.add(10);
		values.add("Hello");
		values.add(2,2.2);
		
		for(int i=0; i<values.size();i++)
		{
			System.out.println(values.get(i));
		}
		
		System.out.println();
		
		for(Object o:values)
		{
			System.out.println(o);
		}
		*/
		/*
		// List interface (type safe) 
		List<Integer> values = new ArrayList<>();
		values.add(4);  // Integer Wrapper class
		values.add(9);
		values.add(10);
		
		for(Integer o:values)
		{
			System.out.println(o);
		}
		*/
		/*
		// List interface (collections) 
		List<Integer> values = new ArrayList<>(); // List is mutable
			values.add(4);  // Integer Wrapper class
			values.add(985);
			values.add(150);
			values.add(13);
			values.add(102);
			values.add(2367);
			
			Collections.sort(values); 
			Collections.reverse(values);
			Collections.shuffle(values);
			
			for(Integer o:values)
			{
				System.out.println(o);
			}
			*/
		/*
			// List interface (compare) 
			List<Integer> values = new ArrayList<>(); // List is mutable
				values.add(4);  // Integer Wrapper class
				values.add(985);
				values.add(150);
				values.add(13);
				values.add(102);
				values.add(2367);
				
				//Lambda and anonomous class
				//Comparator<Integer> c = (i, j) -> i%10>j%10?1:-1;  //1-> swap elements and 2-> not swap
				
				Collections.sort(values,(i, j) -> i%10>j%10?1:-1); 
				
				for(Integer o:values)
				{
					System.out.println(o);
				}
		*/
		// List Student class
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23,"Ashok",66));
		studs.add(new Stud(24,"Kumar",56));
		studs.add(new Stud(25,"Kanchana",76));
		studs.add(new Stud(26,"Kumari",86));
		
		Collections.sort(studs);
		
		for(Stud s:studs)
		{
			System.out.println(s);
		}
}

}
