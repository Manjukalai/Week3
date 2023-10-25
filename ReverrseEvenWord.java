package week3.day1.assgn;

public class ReverrseEvenWord {

	public static void main(String[] args) {
					
			//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

			
			String test = "I am a software tester";
			String[] splt = test.split(" ");
			String rev="";
			
			
			for(int i=0;i<=splt.length;i++)
			{
				if(i%2!=0)
				{
					char[] ch = splt[i].toCharArray();
					
					for(int j=ch.length-1;j>=0;j--)
					{
						rev=rev+ch[j];
					}
					System.out.print(rev);

				}
				else
				{
					System.out.print(splt[i]);
				}
						}
	}

}
