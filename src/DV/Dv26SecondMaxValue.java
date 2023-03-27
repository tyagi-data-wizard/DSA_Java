package DV;

import java.util.Iterator;
import java.util.Scanner;

public class Dv26SecondMaxValue {

// 24  23 55  66 77
// max second max
// 24   24
// 24   23
// 66   24
	
	
	public static int seconMaxValue(int[] arr) {
		
		if(arr == null || arr.length==0){
			throw new IllegalArgumentException("Invalid input");
		}
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax = max;
				max = arr[i];
			}else if(arr[i]>secondMax && arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		return secondMax;
		
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
		
		System.out.println("2nd max valu;e = "+seconMaxValue(arr));
		
	}
}
