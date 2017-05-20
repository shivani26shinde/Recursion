# Strings of all lengths from given string

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static HashSet<String> set = new HashSet<>();
	public static void Permute(String pref, String suff){
		set.add(pref);
		for(int i=0;i<suff.length();i++){
			Permute(pref+suff.charAt(i), suff.substring(0,i)+suff.substring(i+1,suff.length()));
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		String pref = "";
		String suff = "ABC";
		Permute(pref, suff);
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}
}