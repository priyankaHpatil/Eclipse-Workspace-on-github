package com.arrays.programs;

public class ZeroesEnd {
public static void main(String[] args) {
	int arr[]= {3,0,1,0,9,0,0,55,6,0,22,33};
	int count=0;
	for (int i=0;i<=arr.length-1;i++) {
		if(arr[i]!=0) {
		arr[count]=arr[i];
		count++;
		}
		}
		while(count<arr.length) {
			arr[count]=0;
			count++;
			
		}	
	
	for(int j=0;j<=arr.length-1;j++) {
		System.out.print(arr[j]+" ");
	}
}
}
