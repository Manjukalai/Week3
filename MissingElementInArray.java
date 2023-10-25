package week3.day1.assgn;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,7,6,8};
		Arrays.sort(arr);
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+"  ");
						
		}
	}

}
