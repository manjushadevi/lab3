package lab3;

import java.util.Scanner;

public class Sentence {
public static void main(String[] args)
{int count=0;
int count1 = 1;
int count2=0;
	@SuppressWarnings({ "resource" })
	Scanner sc=new Scanner(System.in);
	System.out.println("enter file ");
	String str=sc.nextLine();
	System.out.println(str);
	int length=str.length();
	for(int i=0;i<length;i++)
	{
		if(str.charAt(i)!=' ' && str.charAt(i)!='.')
		{
			count++;
		}
		str.split(" ");
		str.split(".");
	}
	
	for(int i=0;i<str.length();i++)
	{
		str.split(" ");
		if(str.charAt(i)==' ')
		{
		count1++;
		}
	}
	str.split(".");
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='.')
		{
		count2++;
		}
	}
	System.out.println("no.of letters :"+count);
	System.out.println("no.of words :"+count1);
	System.out.println("no.of Sentences :"+count2);
	
}
}
