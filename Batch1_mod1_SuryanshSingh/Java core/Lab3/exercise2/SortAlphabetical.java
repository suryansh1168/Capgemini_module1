package Lab3.exercise2;



import java.util.*;
import java.lang.*;
import java.io.*;


 class SortAlphabetical {
	public static String[] getSorted(String []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=reverse(arr[i]);
		}
		Arrays.sort(arr);
		for(int i=1;i<=arr.length/2;i++)
		{
			arr[i-1]=arr[i-1].toUpperCase();
		}for(int i=arr.length/2+1;i<=arr.length;i++){
			arr[i-1]=arr[i-1].toLowerCase();
		}
		return arr;
	}
	public static String reverse(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String[] in=new String[size];
		for(int i=0;i<size;i++)
			in[i]=sc.next();
		
		String out[]=getSorted(in);
		for(int i=0;i<out.length;i++)
			System.out.println(out[i]);
	}
}
