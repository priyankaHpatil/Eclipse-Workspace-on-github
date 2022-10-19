package com.arrays.programs;

import java.util.Scanner;

class AA {
	
	public void m1() {
		System.out.println("mAA");
	}
}
class B extends AA{
	public void m1() {
		System.out.println("mB");
	}
	
}

public class alphaNum extends B{

	public static void main(String[] args) {
		alphaNum a =  (alphaNum) new AA();
		a.m1();
		
		System.out.println("alpha");
		
	}
	public void m1() {
		System.out.println("mAlpha");
	}
	
	
}