package lab3;

import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		char str1;
		@SuppressWarnings({ "resource" })
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("string :"+str);
		for(int i=0;i<str.length();i++)
		{
			str1=str.charAt(i);
			System.out.println("string :"+str1+" "+(int)str1);
			int[] str2=new int[3];
			for(int i1=0;i1<str1;i1++)
			{
				str2[i1]=str1;
				
				if(str2[i1]>str2[i1+1])
				{
					System.out.println("positive string");
				}
				else
				{
					System.out.println("negative string");
				}
			}
		}
	}
}


