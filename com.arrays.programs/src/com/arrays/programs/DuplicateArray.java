package com.arrays.programs;

public class DuplicateArray {
public static void main(String[] args) {
	int arr1[]= {4,3,2,2,6,6,7,7,8};
	for(int i=0;i<arr1.length;i++) {
		for(int j=i+1;j<arr1.length;j++) {
			if(arr1[i]==arr1[j]) 
				System.out.print(arr1[i]+" ");
			
		}
	}
	
}
}
