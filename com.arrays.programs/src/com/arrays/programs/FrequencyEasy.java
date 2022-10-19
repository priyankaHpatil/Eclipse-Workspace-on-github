package com.arrays.programs;

public class FrequencyEasy {
public static void main(String[] args) {
	int arr[]= {1,4,3,1,2,5,5};
	int emt[]= {0,0,0,0,0,0,0};
	int n=7;
			
	int c=0;
	for(int i=0;i<n;i++) {
		c=1;
		if(arr[i]!=-1) 
		for(int j=i+1;j<n;j++) {
			if(arr[i]==arr[j]) {
				c=c+1;
				arr[j]=-1;
			
		}
		emt[i]=c;
		}
	}
	
		for(int i=0;i<n;i++) {
			if(arr[i]!=-1){
			System.out.println(arr[i]+"      "+emt[i]);
		}}
}
}
