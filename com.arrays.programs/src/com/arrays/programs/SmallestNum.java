package com.arrays.programs;

public class SmallestNum {
public static void main(String[] args) {
	int arr[]= {3,2,5,7,4,-1,-2,4,8};
	int SmallestNum=0;
	int temp=arr[0];
	for(int i=0;i<arr.length;i++) {
			if(arr[i]<temp) {
			
			temp=arr[i];
			System.out.print(temp);
		
			}
		}
	SmallestNum=temp;
	System.out.println("Smallest number=");
	System.out.println(SmallestNum);
}
}
