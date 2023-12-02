package com.string.stringss;

public class Test {

	public static void main(String[] args) 
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int k=1;k<i;k++)
			{
				System.out.print("-");
			}
		}
		/*for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int k=5;k<i;k--)
			{
				
			}
		}
		*/
		
	/*	for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}*/

	}

}
