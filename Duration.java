package lab3;
import java.util.Scanner;

public class Duration {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner g=new Scanner(System.in);
		String str1=g.next();
		String[] str=str1.split("/");
		String date=String.valueOf(java.time.LocalDate.now());
		String[] str2=date.split("-");
		
		int[] str3 =new int[3];
		for(int i=0;i<=str2.length;i++)
		{
			str3[i]=Integer.parseInt(str[i])-Integer.parseInt(str2[i]);
			
			
			if(i>=0 && i<str2.length-1)
			{
			System.out.print(Math.abs(str3[i])+"-");
			}
			else
			{
					System.out.println(Math.abs(str3[i]));
			}
		}
		
	}

}
