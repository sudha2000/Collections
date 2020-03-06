package com.epam.Arraylist;
import java.util.Scanner;

public class Main1 extends ArrayList_operations{
	
	public static void main(String[] args)
	{
		ArrayList_operations ao=new ArrayList_operations();
		Scanner sc=new Scanner(System.in);
				while(true)
				{
				int ch;
				
				System.out.println("\n 1.fetch 2.add 3.print1 4.remove 5.exit\n");
				System.out.println("enter your choice");
				ch=sc.nextInt();
				switch(ch)
				{
				   case 1:
					       int a;
					       System.out.println("enter element");
					       a=sc.nextInt();
					       ao.fetch(a);
					       break;
				   case 2:
					      int p,q;
					      System.out.println("enter 2 elements");
					       p=sc.nextInt();
					       q=sc.nextInt();
					       ao.add(p, q);
					       break;
				   case 3:
					     ao.print1();
					     break;
				   case 4:
					   int k;
					   System.out.println("enter element");
				       k=sc.nextInt();
					   ao.remove(k);
					   break;
				   default:
					   return ;
					   
				}
			}
	}
}
