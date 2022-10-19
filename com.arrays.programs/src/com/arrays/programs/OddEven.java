package com.arrays.programs;

public class OddEven {
public static void main(String[] args) {
	int evenNum=0;
	int OddNum=0;
	int arr[]= {3,3,6,4,3,1,2,4};
	System.out.println("Even numbers");
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.print(arr[i]+" ");
			
		}
	}
	System.out.println();
	System.out.println("Odd numbers");
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0)
		System.out.print(arr[i]+" ");
	}
	
	
}
}
