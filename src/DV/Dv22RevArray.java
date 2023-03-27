package DV;

import java.util.Iterator;
import java.util.Scanner;

public class Dv22RevArray {

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp  = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
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
		
		reverse(arr, 0, arr.length-1);
		printArray(arr);
		
	}
}
