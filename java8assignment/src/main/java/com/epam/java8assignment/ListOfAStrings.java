package com.epam.java8assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfAStrings {
	
	List<String> list = new ArrayList<String>();

	public ListOfAStrings(List<String> array) {
		// TODO Auto-generated constructor stub
		this.list = array;
		
	}
	
	public List<String> getStrings() {
		return list.stream().filter(str->str.length()==3 && str.startsWith("a")).collect(Collectors.toList());
	}
	
}
