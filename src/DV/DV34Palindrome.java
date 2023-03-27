package DV;

import java.util.Iterator;
import java.util.Scanner;

public class DV34Palindrome {
	
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	public boolean checkPalindrome(String word ) {
		
		char[] wordArray = word.toCharArray();
		
//		for(int i=0;i<wordArray.length/2;i++) {
//			if(wordArray[i]!=wordArray[wordArray.length-i-1]) {
//				return false;
//			}
//		}
		int start=0;
		int end=wordArray.length-1;
		
		while(start<end) {
			if(wordArray[start]!=wordArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		 
		String word;
		System.out.print("Enter the word : ");
		Scanner sc = new Scanner(System.in);
		word = sc.nextLine();
		
		
		
		
		DV34Palindrome obj =  new DV34Palindrome();
		boolean flag = obj.checkPalindrome(word);
		
		System.out.println("Palindrome or not : "+flag);
		
		
	}
}
