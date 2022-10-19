package com.arrays.programs;
import java.util.Arrays;

public class RightRotate {
public static void main(String[] args) {
	int arr[]= {3,4,5,1,6};
	int last=arr[arr.length-1];
 
 for(int i=arr.length-2;i>=0;i--) {
	 arr[i+1]=arr[i];
 }
 arr[0]=last;
 
 for(int i=0;i<=arr.length-1;i++) {
	 System.out.print(arr[i]+" ");
 }
}
}
