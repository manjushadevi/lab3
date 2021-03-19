package lab3;

import java.util.Scanner;

public class Difference {
static int num;
static char c;
static char c1;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter num");
		num=sc.nextInt();
		System.out.println(num);
		String str=Integer.toString(num);
		StringBuffer sb=new StringBuffer();
		int i=0;
		for(i=0;i<str.length()-1;i++)
		{
			c=str.charAt(i);
			c1=str.charAt(i+1);
			
			int val=modifyNumber(c,c1);
			
			sb.append(val);    
		}
		sb.append(Integer.parseInt(String.valueOf(str.charAt(str.length()-1))));
		
		System.out.println(sb);

	}
	public static int modifyNumber(char g,char h) {
		int n=Integer.parseInt(String.valueOf(h));
		int m=Integer.parseInt(String.valueOf(g));
		System.out.println(n);
		return Math.abs(m-n);
		
	}

}
