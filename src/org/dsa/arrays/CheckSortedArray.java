package org.dsa.arrays;

import java.util.Scanner;

public class CheckSortedArray {
	public static void checkSorted() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of elements : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + " elements");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean sorted = true;
		for(int i=0;i<n-1;i++) {
			if(arr[i] > arr[i+1]) {
				sorted = false;
				break;
			}
		}
		
		if(sorted) {
			System.out.println("Array is sorted");
		}else {
			System.out.println("Array is not sorted");
		}
		sc.close();
	}

}
