package DV;

import java.util.Scanner;

public class DV20EvenInteger {

	public static void main(String[] args) {
		Scanner  scanner  = new Scanner(System.in);
		System.out.print("the size of the array ");
		int size = scanner.nextInt();
		
		int[] orgArr = new int[size];
		int count = 0;
		
		for(int i=0 ; i<size; i++) {
			System.out.println("Enter the "+i+" element");
			orgArr[i] = scanner.nextInt();
			if(orgArr[i]%2!=0) {
				count++;
			}
		}
		
		int[] res = new int[count];
		int j=0;
		for(int i=0 ; i<size; i++) {
			if(orgArr[i]%2!=0) {
				res[j]=orgArr[i];
				j++;
			}
			
		}
		System.out.println("The new array is :");
		
		for(int i=0 ; i<count; i++) {
			System.out.print(res[i]+" ");
			
		}
	

	}

}
