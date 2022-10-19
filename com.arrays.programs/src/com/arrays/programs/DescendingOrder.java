package com.arrays.programs;
import java.util.Arrays;

public class DescendingOrder {
public static void main(String[] args) {
int arr[]= {3,5,6,1,9};
Arrays.sort(arr);
System.out.printf("%s",Arrays.toString(arr));   //this first sort elements in arrays
	
//%s is foe string values
	
System.out.println();
System.out.println("array in descending order=");
for(int i=arr.length-1;i>=0;i--) {
	System.out.print(arr[i]+" ");
}
}
}
