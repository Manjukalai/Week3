package week3.day1.assgn;
import java.util.Arrays;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String text = "changeme";
		char[] data= text.toCharArray();
		
		for(int i=0;i<=data.length-1;i++)
		{
			if(i%2==0)
			{
				char upper= Character.toUpperCase(data[i]);
				System.out.print(upper);
				
			}
			else
			{
				System.out.print(data[i]);//ln removed to print in same line
			}
		}
		
	}

}
