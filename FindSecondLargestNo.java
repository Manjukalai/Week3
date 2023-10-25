package week3.day1.assgn;

import java.util.Arrays;

public class FindSecondLargestNo {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		
		
		Arrays.sort(data);
		int size=data.length;
		
		System.out.println(data[size-2]);
		
	}

}
