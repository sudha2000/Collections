package com.epam.Arraylist;
import java.io.*;
import java.util.*;

public class ArrayList_operations {
	
	ArrayList<Integer> arrl=new ArrayList<Integer>(10);
	
	ArrayList_operations()
	{
		
		arrl.add(1);
		arrl.add(3);
		arrl.add(20);
		arrl.add(23);
		arrl.add(21);
		arrl.add(18);
		arrl.add(3);
		arrl.add(67);
		arrl.add(9);
		arrl.add(13);
	}
	public void add(int a,int b)
	{
		arrl.add(a,b);
	}
	public void print1()
	{
		for(int i=0;i<arrl.size();i++)
		{
			System.out.print(arrl.get(i)+" ");
		}
	}
	public void remove(int ele)
	{
		int a=arrl.indexOf(ele);
		arrl.remove(a);
	}
	public void fetch(int ele)
	{
		int c=0;
		for(int i=0;i<arrl.size();i++)
		{
			int a=arrl.get(i);
			if(a==ele)
			{
				System.out.println("element found");
				c=1;
				break;
			}
		}
		if(c==0)
		{
			System.out.println("Element not found");
		}
	}
	
	

}
