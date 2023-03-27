package DV;

import java.util.Iterator;
import java.util.Scanner;

public class Dv25MinValue {


	
	public static int minValue(int[] arr) {
		
		if(arr == null || arr.length==0){
			throw new IllegalArgumentException("Invalid input");
		}
		
		int min = arr[0];	
				
		for(int i=1;i<arr.length;i++) {
			
				
		if(min > arr[i]){
					min = arr[i];
			}
		}
		
		return min;
	}
	
	
	public static void main(String[] args) {
		 
		int size;
		System.out.print("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the array numbers : ");
		for(int i=0;i<size;i++) {
				int temp = sc.nextInt();
				arr[i]=temp;
				
		}
		
		System.out.println("min valu;e = "+minValue(arr));
		
	}
}
