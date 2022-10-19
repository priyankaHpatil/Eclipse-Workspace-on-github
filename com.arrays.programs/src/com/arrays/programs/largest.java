package com.arrays.programs;

public class largest {
public static void main(String[] args) {
	int arr[]= {3,5,16,9,72,3,5,889,7};
	int larg=0,count=0;
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]>arr[j]) {
				larg=arr[i];
			}
			}
		}
	System.out.println(larg);
	}
}

