package com.arrays.programs;

public class sortAsce {
public static void main(String[] args) {
	int arr[]= {4,32,34,3,3,5,6,7,333};
	int temp=0;
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
	}
	//for(int i=0;i<=arr.length-1;i++) {
		System.out.println(arr[1]);
	//}
}
}
