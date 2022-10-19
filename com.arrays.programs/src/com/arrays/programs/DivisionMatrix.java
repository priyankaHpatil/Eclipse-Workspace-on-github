package com.arrays.programs;

public class DivisionMatrix {
	public static void main(String[] args) {
		
	
	double a[][]= {{1,2,3},{4,3,2},{5,4,3}};
    double b[][]= {{6,5,4},{1,2,3},{1,2,3}};
    double c[][]=new double[3][3];
    for(int i=0;i<=2;i++) {
    	for(int j=0;j<=2;j++) {
    		c[i][j]=a[i][j]/b[i][j];
    	}
    }
    for(int i=0;i<=2;i++) {
    	for(int j=0;j<=2;j++) {
    System.out.print((double)(c[i][j])+" ");
    	}
    	System.out.println();  
}
}
}
