package com.arrays.programs;

public class SumofEle {
public static void main(String[] args) {
	int arr[]= {3,4,5,6,2,1,6,7,8};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println("Sum of elements of array=");
	System.out.print(sum+" ");
}
}
