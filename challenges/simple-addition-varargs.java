//Learn concept of varargs in java
@author : Millan Kaul
@date: 18 Sep, 2017
/*
For Java: You can pass variable number of arguments to a method by using a Java feature called: varargs (Variable arguments). 
The syntax to declare such method is:
public void MethodName(type ... variableName) { }
Ellipsis (three dots) is part of the syntax. 
You can loop through the variableName just like you do with an array and fetch the arguments. 
*/

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Add {
	public void add(int... intArgs) {
		int sum = 0;
		String separator = "";
		for (int i : intArgs) {
			sum += i;
			System.out.print(separator + i);
			separator = "+";			
		}
		System.out.println("=" + sum);
	}
}

public class Solution {

    public static void main(String[] args) {
       try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);
			Method[] methods=Add.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
}
