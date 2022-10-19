package com.arrays.programs;
import java.util.Arrays;                        ////package must be imported

public class ThirdLargestN {
public static void main(String[] args) {
	float arr[]= {1.23f,-56.6f,-2.3f,100.1f,120.0f};
	Arrays.sort(arr);                             ///this sorts in ascending order to arr elements first
	System.out.println(arr[arr.length-3]);
}
}
