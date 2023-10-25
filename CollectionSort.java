package week3.day2.assign;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionSort {

	public static void main(String[] args) {
		String[] values= {"Google","Microsoft","Testleaf","Maverick"};
		int len = values.length;
		Arrays.sort(values);
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(values[i]+" ");
			
		}
		
		
	}
}
