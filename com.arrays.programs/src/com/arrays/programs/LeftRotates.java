package com.arrays.programs;

public class LeftRotates {
public static void main(String[] args) {
	int arr[]= {3,4,5,5,3,2};
	int first=arr[0];
	for(int i=1;i<=arr.length-1;i++) {
		arr[i-1]=arr[i];
		
	}
	arr[arr.length-1]=first;
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	
}

}
