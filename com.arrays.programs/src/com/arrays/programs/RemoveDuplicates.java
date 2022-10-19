package com.arrays.programs;

public class RemoveDuplicates {
public static void main(String[] args) {
	int arr[]= {1,3,5,7,-1,-1,2,2,3,5,3,1,-1};
	int n=arr.length;
	int visitedArr[]=new int[n];
	int visited=-1;
	for(int i=0;i<=n-2;i++) {
		int count=1;
		for(int j=i+1;j<=n-1;j++) {
			if(arr[i]==arr[j]) {
				count++;
				visitedArr[j]=visited;
			}
		}
		if(visitedArr[i]!=visited) {
			visitedArr[i]=count;
		}
	}
	for(int i=0;i<=n-1;i++) {
		if(visitedArr[i]!=visited) {
			System.out.println(arr[i]+" ");
		}
	}
		
}
}

	

