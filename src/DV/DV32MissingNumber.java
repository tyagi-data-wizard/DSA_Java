package DV;

import java.util.Iterator;
import java.util.Scanner;

public class DV32MissingNumber {
	
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	public int missingNumber(int[] arr ) {
		int sum  = 0 ;
		int len = arr.length;
		int trueSum = (len+1)*(len+1+1)/2;
		for(int num : arr) {
			trueSum = trueSum-num;
		}
		
		return (trueSum);
		
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
		
		
		DV32MissingNumber obj =  new DV32MissingNumber();
		int missingNo = obj.missingNumber(arr);
		
		System.out.println("Missing number = "+missingNo);
		
		
	}
}
