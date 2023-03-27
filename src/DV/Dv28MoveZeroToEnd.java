package DV;

import java.util.Iterator;
import java.util.Scanner;

public class Dv28MoveZeroToEnd {
	
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	public static void moveZero(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
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
		
		moveZero(arr);
		
		System.out.println("new array : ");
		printArray(arr);
		
	}
}
