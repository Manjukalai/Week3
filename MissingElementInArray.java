package week3.day2.assign;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
			int count=1,i,j;
			
				int[] arr = {1,2,3,4,7,6,8};
				Arrays.sort(arr);
				for(i=0;i<=arr.length-1;i++)
					{
					for(j=i+1;j<=arr.length-1;j++)
					{
						if(arr[i]!=i+count)
						{
							
							System.out.print(i+count);
							count++;
							
						}
					}
					
					
					}

	}

}
