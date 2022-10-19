package com.arrays.programs;

import java.util.Scanner;

public class ArrayScanner {
	public static void main(String[] args) {
	int r,c,i,j;
	Scanner sc=new Scanner(System.in);


System.out.println("enter number of rows");
	 r=sc.nextInt();
	System.out.println("enter number of columns");
	c=sc.nextInt();
	int arr[][]=new int [r][c]; 
	System.out.println("enter elements of array");
	for( i=0;i<r;i++) {
		for(j=0;j<c;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("elements of the array are");
	for(i=0;i<r;i++) {
		for(j=0;j<c;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}