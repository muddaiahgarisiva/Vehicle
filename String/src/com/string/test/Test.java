package com.string.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		int[] inn= {1,5,6,4,78,9,11};
		
		
		
		List<Integer> list=new ArrayList<Integer>();
		List<String> list1=new ArrayList<String>();
		/*list1.add("a");
		list1.add("c");
		list1.add("x");
		list1.add("z");
		list1.add("d");*/
		List<String> ss=list1.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(ss);
		list.add(10);
		list.add(1);
		list.add(6);
		list.add(16);
		list.add(11);
		list.add(110);
		Integer ii=list.stream().max((i,j)->-i.compareTo(j)).get();
		System.out.println(ii);
		long counts=list.stream().filter(i->i<20).count();
		System.out.println(counts);
		List<Integer> ll=list.stream().sorted((i,j)->(i<j)?1:(i>j)?-1:0).collect(Collectors.toList());
		System.out.println(ll);
		
		ArrayList<Integer> al=new ArrayList();
		if(!al.contains(list))
		{
			al.addAll(list);
			System.out.println(al);
		}
		List<Integer> list2=list.stream().filter(i->i<17).map(i->i+5).collect(Collectors.toList());
		System.out.println(list2);
	}

}
