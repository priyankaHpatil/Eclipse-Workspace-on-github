package com.arrays.programs;
import java.util.Arrays;

public class AscendingOrder {
public static void main(String[] args) {
	/*double arr[]= {4.0 , 3.1 , 2.0 , 6.0};
Arrays.sort(arr);
System.out.printf("Modified arr[]: %s",Arrays.toString(arr));
}
}*/
	
int temp=0;
int arr[]= {1,3,6,0,4,-1,-22,12,2,6};
for(int i=0;i<=arr.length-1;i++) {
	for(int j=i+1;j<=arr.length-1;j++) {
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			System.out.println("hello worls as usual");
		}
		
	}
	System.out.println(arr[i]);
}}}
