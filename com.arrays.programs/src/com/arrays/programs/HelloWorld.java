package com.arrays.programs;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println((char)97);
		String s="afghijklmnopqrstvwx";
		char[] c=s.toCharArray();
		
		int j=97;
		for(int i=0;i<c.length;i++) {
			if(c[i]==(char)j) {
				//System.out.println();
			}
			else {
				System.out.println(((char)j)+"    "+"mising");
			}
			j++;
			
		}
		
	}}
