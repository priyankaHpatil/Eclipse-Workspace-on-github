package com.arrays.programs;
import java.util.*;
class A{
	void p() {
		System.out.println("k");
	}
}
public class arrays extends A {
public static void main(String[] args) {
	arrays a=new arrays();
	a.p();
	String sc="fg";
	String sb=sc;
	String s2=new String("dc").intern();
	String s1=new String("ab").intern();
	String s3=new String("ab").intern();
	System.out.println(s1==s3);
	System.out.println(s1==s2);
	System.out.println(sc==sb);
	}
}
