package com.arrays.programs;

public class SmallestN {         //Smallest number in array
	public static void main(String[] args) {
		int arr[]= {4,3,5,7,3,-1,9,2,0,1,8};
		int temp=arr[0];
		System.out.println("Smallest number is=");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<temp) {
				temp=arr[i];
				
			}    
		}
		System.out.println(temp);
	}

}
