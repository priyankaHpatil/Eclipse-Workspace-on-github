package com.arrays.programs;

public class EleEven {
public static void main(String[] args) {
	int arr[]= {2,4,5,6,7,2,5};
   
	
	for(int i=0;i<arr.length;i++) {
		int countd=0;
		if(arr[i]%2==0) {
			System.out.print("even"+"="+arr[i]+" ");
			}}
	System.out.println();
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2!=0) {
			System.out.print("odd"+"="+arr[i]+" ");
		}}
		System.out.println();
		for(int i=0;i<=arr.length-1;i++) {
			
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		}
	}
	


