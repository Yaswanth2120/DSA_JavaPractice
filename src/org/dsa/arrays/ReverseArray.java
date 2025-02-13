package org.dsa.arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void reverseArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + " elements");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int left=0, right=n-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		System.out.println("Reversed Array : ");
		for(int num:arr) {
			System.out.print(num + " ");
		}
		sc.close();
	}

}