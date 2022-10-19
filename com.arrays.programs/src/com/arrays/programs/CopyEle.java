package com.arrays.programs;


public class CopyEle {
public static void main(String[] args) {
	int[] arr1= new int [] {4,6,3,8,9};
	int arr2[]= new int[arr1.length];
	for(int i=0;i<arr1.length;i++) {
		arr2[i]=arr1[i];         //write arrr2 first
		
	}
	System.out.println("elements of original array");
	for(int i=0;i<=arr1.length-1;i++) {
		System.out.print(arr1[i]+"  ");
	}
	System.out.println();
	System.out.println("elements of copied array is");
	for(int i=0;i<=arr2.length-1;i++) {
		System.out.print(arr2[i]+"  ");
	}
	
}
}
