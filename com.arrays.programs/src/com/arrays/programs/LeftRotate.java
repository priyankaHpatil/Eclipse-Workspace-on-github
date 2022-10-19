package com.arrays.programs;

import java.util.Arrays;

public class LeftRotate {
public static void main(String[] args) {
 int arr[]= {2,4,1,4,7,8};
 int n=3;
int size=arr.length;
for(int j=1;j<=n;j++) {
	int first=arr[0];
 for(int i=0;i<size-1;i++) {
	 arr[i]=arr[i+1];
 }
 arr[size-1]=first;
 }
 System.out.println(Arrays.toString(arr));
}
}
/*   Another method
 
  int arr[]= {0,2,-1,0,5,2,4,-2,0,-1,5,7,2,4,4};
		int l=arr.length;
		int first;
		first=arr[0];
		for(int i=0;i<=l-2;i++) {
           
			arr[i]=arr[i+1];
			
		}
		arr[l-1]=first;
		for(int i=0;i<=l-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}}*/
