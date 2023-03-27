package DV;

import java.util.Iterator;
import java.util.Scanner;

public class DV30ResizeArray {
	


	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	public int[] resizeArray(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		
		for(int i=0;i<arr.length;i++) {
			temp[i] =arr[i];
		}
		
		return temp;
		
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
		System.out.println("Enter the resize capacity : ");
		int capacity = sc.nextInt();
		
		DV30ResizeArray obj =  new DV30ResizeArray();
		arr = obj.resizeArray(arr, capacity);
		
		System.out.println("new array : ");
		printArray(arr);
		
	}
}
