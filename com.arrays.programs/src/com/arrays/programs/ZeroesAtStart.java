package com.arrays.programs;

public class ZeroesAtStart {
public static void main(String[] args) {
	int arr[]= {3,4,5,0,1,0,5,9,0,3,0,4,0,2,0};
	int count=arr.length-1;
	for(int i=arr.length-1;i>=0;i--) {
		if(arr[i]!=0) {
			arr[count]=arr[i];
			count--;
			
		}
		}
	while(count>=0) {
		arr[count]=0;
		count--;
	}
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}

	}
}

