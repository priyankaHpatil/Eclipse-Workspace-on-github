package com.arrays.programs;

public class Array {
public static void main(String[] args) {
	Array obj=new Array();
	int arr[]=obj.get();
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
	 int[]get(){
		return new int[] {10,30,50,90,60};
		
	}

}

