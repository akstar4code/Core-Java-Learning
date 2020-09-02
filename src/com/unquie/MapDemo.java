package com.unquie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo
{

	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		// Map<String, String> map = new HashTree<>(); //Sachorized
		map.put("Actor", "John");
		map.put("Ceo", "Ashok");
		map.put("Name", "Ashok");
		map.put("Name", "Kumar"); //Replace the old one
		
		System.out.println(map);
		
		System.out.println(map.get("Nameghf"));
		
		Set<String> keys = map.keySet();
		
		for(String key:keys)
		{
			System.out.println(key + " " + map.get(key));
		}
		
	}

}
