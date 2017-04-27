# Recursion
# Print array elements in forward and backward order without loop

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a = new int[] {1,2,3,4};
		print(a.length, a);
		printR(a.length, a);
	}
	public static void print(int n, int[] a){
		if(n == 0){
			return;
		}
		print(n-1, a);
		System.out.println(a[n-1]);
	}
	public static void printR(int n, int[] a){
		if(n == 0){
			return;
		}
		System.out.println(a[n-1]);
		print(n-1, a);
	}
}