package com.arrays.programs;

public class Frequency {
public static void main(String[] args) {
	int arr[]= {1,2,-1,1,-2,-2,-1,-2,1,-1,0,-1,2,-3,-2,5,1};
	int fr[]=new int [17];
	int l=arr.length;
	int visited=-1;
	//mark visited to only another array elements
	for(int i=0;i<=l-1;i++) {
		int count =1;
		for(int j=i+1;j<=l-1;j++) {
			if(arr[i]==arr[j]) {
				count++;
				fr[j]=visited;
				
			}
		}
		if(fr[i]!=visited) {
		fr[i]=count;}
	}
	System.out.println("------------------------------------");
	System.out.println("Element|Frequency");
	System.out.println("---------------------------------------");
	for(int i=0;i<fr.length;i++) {
		if(fr[i]!=visited)
			System.out.println(" "+arr[i]+" | "+fr[i]);
	}
	System.out.println("-------------------------------------");
}
}




