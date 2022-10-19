package com.arrays.programs;

public class EleInRev {
public static void main(String[] args) {
	int arr1[]= {3,3,5,6,1,8};
	System.out.println("Elements of array in reverse order");
	for(int i=arr1.length-1;i>=0;i--) {
		System.out.print(arr1[i]+" ");
	}
}
}
