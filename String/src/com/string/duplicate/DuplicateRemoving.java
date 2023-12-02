package com.string.duplicate;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemoving {
  public static void main(String[] args) {
	  String s="cchhaanndra";
	  char[] cc=s.toCharArray();
	 // HashSet s1=new HashSet();
	  StringBuilder sb=new StringBuilder();
	  String str="";
	  Set<Character> hashset=new HashSet<Character>();
	  for(int i=0;i<s.length();i++)
	  {
		  hashset.add(s.charAt(i));
	  }
	  for(Character c:hashset)
	  {
		  sb.append(c);
	  }
	  System.out.println(sb);
	  
	  
	/*String[] ch= {"shiva","raju","chandra","ravi","raju"};
	String[] ch1= {"madhu","madhu","shiva"};
	
	HashSet s=new HashSet();
	
	for(String c:ch)
	{
		for(String cc:ch1)
		{
			s.add(cc);
		}
		s.add(c);
	}
	System.out.println(s);
   }*/
  }
}
