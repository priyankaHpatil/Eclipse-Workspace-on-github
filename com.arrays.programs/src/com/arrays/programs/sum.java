package com.arrays.programs;

public class sum {
public static void main(String[] args) {
	int arr[]= {3,1,2,3,4,3,2,2};
	int sum=0;
	for(int i=0;i<=arr.length-1;i++) {
		sum+=arr[i];
	}
	System.out.println(sum);
}
}
