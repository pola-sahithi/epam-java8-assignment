package com.epam.java8assignment;

import java.util.*;

public class App {
	
	public static void main(String args[])
	{
		//Average Of List
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		
		listOfNumbers.add(1);
		listOfNumbers.add(2);
		listOfNumbers.add(3);
		listOfNumbers.add(1);
		listOfNumbers.add(4);
		listOfNumbers.add(7);
		listOfNumbers.add(9);
		listOfNumbers.add(2);
		listOfNumbers.add(10);
		listOfNumbers.add(23);
		
		AvgOfList avg= new AvgOfList(listOfNumbers);
		avg.average();
		
		//Palindrome List
		
		List<String> arr = Arrays.asList("ana","mom","abc","abcba","ihdj");
		
		PalindromeList plist = new PalindromeList(arr);
		 
		//list of string starting with 'a' and length = 3

		List<String> array = Arrays.asList("ana","mdkjm","abc","abcba","ihdj","ant","najsh","bob");
		
		ListOfAStrings astr = new ListOfAStrings(array);
		
		System.out.println("Strings starting with 'a' and length =3" + astr.getStrings());
		
		
		
		
		
	}
}
