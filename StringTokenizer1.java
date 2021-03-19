package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer1 {


	public static void main(String[] args) {
		int num;
		int sum=0;
		@SuppressWarnings({ "resource" })
		Scanner s=new Scanner(System.in);
		System.out.println("enter numbers.....");
		String str=s.nextLine();
		StringTokenizer st=new StringTokenizer(str," ");
		System.out.println("sum of integers is :");
		while(st.hasMoreTokens())
		{
			String temp=st.nextToken();
			num=Integer.parseInt(temp);
			System.out.println(num);
			sum=sum+num;
			System.out.println(sum);
		}
		

	}

}
