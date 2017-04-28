# Recursion
# Hanoi's Tower

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Hanoi(3, "S", "D", "A");
	}
	public static void Hanoi(int n, String source, String dest, String aux){
		if(n==1){
			System.out.println(source + " -> " + dest);
			return;
		}
		Hanoi(n-1, source, aux, dest);
		System.out.println(source + " -> " + dest);
		Hanoi(n-1, aux, dest, source);
	}
}