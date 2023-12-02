package com.string.test;

import java.util.stream.IntStream;
public class TestString
{
	public static void main(String[] args) 
	{	
		String matter="computer";
	
       char ch1[]=matter.toCharArray();
				for(int i=ch1.length-1;i>=0;i--)
		{
			System.out.print(ch1[i]);
		}
		/*String message="technologies";
		char ch[]=message.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}*/
	
		for(int i=1;i<=5;i++) 
		 {
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i-1);k++) 
		{   
			System.out.print("*");	
		}
		System.out.println();
		}
		}
		
}
