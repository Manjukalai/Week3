package week3.day1.assgn;

public class Palindrome {

	public static void main(String[] args) {
		String value = "madam";
		char[] v= value.toCharArray();
		
		String rev = "";
		int i;
		
		for(i=v.length-1;i>=0;i--)
		{
			rev= rev + v[i];
			
		}
		System.out.println(rev);
		if(value.contains(rev))
		{
			System.out.println(value+" is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
