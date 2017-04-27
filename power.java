# Recursion
# Power of a number

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x = 2;
		int n = 5;
		System.out.println(Pow(x, n));
	}
	public static int Pow(int x, int n){
		if(n==0){
			return 1;
		}
		int temp = Pow(x, n/2);
		if(n%2 == 0){
			return temp*temp;
		}
		else{
			return x*temp*temp;
		}
	}
}