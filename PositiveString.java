package lab3;

import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("string :"+str);
		checkPositiveString(str);
	}
		public static void checkPositiveString(String s)
		{
		int[] a =new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			a[i]=(int)(s.charAt(i));
		}
		for(int i=0;i<s.length()-1;i++)
		{
						if(a[i]<a[i+1])
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

	



