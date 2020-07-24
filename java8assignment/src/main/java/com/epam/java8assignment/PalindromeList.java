package com.epam.java8assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeList {
	
	List<String> pl = new ArrayList<String>();

	public PalindromeList(List<String> arr) {
		
		pl = (ArrayList<String>) 
				arr.stream().filter(ele->ele.equals(((new StringBuffer(ele)).reverse()).toString() ) )
				.collect(Collectors.toList());
		
		System.out.println("List of Palindromes : "+pl);
		
	}
	

}
