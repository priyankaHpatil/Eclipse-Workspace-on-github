package com.arrays.programs;

public class removeDuplicate {
public static void main(String[] args) {
	int arr[]= {3,3,2,1,3,4,3,3,7,-1,-1};
	int arrs[]=new int[arr.length];
	int count=1,temp=0,visited=-1;
	for(int i=0;i<=arr.length-1;i++) {
		
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]==arr[j]) {
				
				arrs[j]=visited;
				}
		}
	}
	for(int i=0;i<=arrs.length-1;i++) {
		if(arrs[i]!=visited) {
		System.out.print(arr[i]+" ");
		}
	}
	
}
}
