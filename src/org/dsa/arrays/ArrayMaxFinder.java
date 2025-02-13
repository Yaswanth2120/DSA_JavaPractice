package org.dsa.arrays;

import java.util.Scanner;

public class ArrayMaxFinder {
	public static void arrayMaxFinder() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + " elements : ");
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum element is : " + max);
		sc.close();
	}

}