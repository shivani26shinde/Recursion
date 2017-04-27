# Recursion

# Find the sum of digits in a number

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a = 1723;
		System.out.println(Recur(a));
	}
	public static int Recur(int a){
		if(a == 0){
			return 0;
		}
		return a%10 + Recur(a/10);
	}
}