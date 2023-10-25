package week3.day1.assgn;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
String text1="stops";
String text2="potss";
int len1 = text1.length();
int len2= text2.length();
char[] t1 = text1.toCharArray();
Arrays.sort(t1);
char[] t2 = text2.toCharArray();
Arrays.sort(t2);

for(int i=0;i<=len1-1;i++)
{
	for(int j=0;j<=len2-1;j++)
	{
		if(t1[i]==t2[j])
		{
			System.out.println("Both string value compared and declared as Anagram");
		}
	}
}


	}

}
