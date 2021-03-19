package lab3;
import java.util.Scanner;
public class ReplaceString 
{
	static String str1;
	static String str2;
    public static void main(String[] args)
    {
		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
    	System.out.println("enter a string :");
    	str1=k.next();
    	System.out.println("entered string :"+str1);
    	System.out.println("resultant string :"+altStrin(str1.toCharArray()));
    	
    }
    public static boolean isVowel(char ch)
    {
    	if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u')
    {
    	return false;
    }
	return true;
			
    }
    public static String altStrin(char[] s)
    {
    	for(int i=0;i<s.length;i++)
    	{
    		if(!isVowel(s[i]))
    		{
    			if(s[i]=='z')
    			{
    				s[i]='a';
    			}
    			else
    			{
    				s[i]=(char) (s[i]+1);
    				if(isVowel(s[i]))
    				{
    					s[i]=(char) (s[i]+1);
    				}
    			}
    		}
    	}
    return String.valueOf(s);
    }
}