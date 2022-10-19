package com.arrays.programs;

public class MostFrequent {
public static void main(String[] args) {
	int arr[]= {12,12,34,12,5,56,77,66,00,12};
	 int arrs[]= {0,0,0,0,0,0,0,0,0,0};      
	int count=0;
	int n=0;
	int max_value=0;
	for(int i=0;i<=arr.length-1;i++) {
	for(int j=i+1;j<=arr.length-1;j++) {
		if(arr[i]==arr[j]) {
			count++;
		}
	}
	if(count>max_value) {
		max_value=count;
		n=arr[i];
	}
	}
}
}
