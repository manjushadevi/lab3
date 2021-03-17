package lab3;

import java.util.Scanner;

public class StringBufferDemo {

@SuppressWarnings("resource")
public static void main(String[] args)
{
	Scanner str = new Scanner(System.in);
	System.out.println("enter a string :");
	String str1=str.nextLine();
	getImage(str1);
}
public static void getImage(String g)
{
	StringBuffer e =new StringBuffer(g);
	System.out.print(e+"|"+e.reverse());
}
}


