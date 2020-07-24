package com.epam.java8assignment;

import java.util.*;
//import java.util.stream.*;

public class AvgOfList {
	
	ArrayList<Integer> alist = new ArrayList<Integer>();
	
	public AvgOfList(ArrayList<Integer> listOfNumbers) {
		this.alist=listOfNumbers;
		// TODO Auto-generated constructor stub
	}

	void average() {
		alist.stream()
		.mapToInt(number->number)
		.average()
		.ifPresent(avg->System.out.println("Average is:- "+avg));
	}

}
