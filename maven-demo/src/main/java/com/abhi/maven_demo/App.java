package com.abhi.maven_demo;


import java.util.*;
import java.io.*;
abstract class Candy {
	int weight;
	Candy(int weight){
		this.weight=weight;
	}
	abstract void display();
}
class Milkybar extends Candy{
	private int type;
	Milkybar(int weight,int type){
		super(weight);
		this.type=type;
	}
	void display() {
		System.out.println("This is a Milkybar");
		System.out.println(this.weight);
	}
}
class Dairymilk extends Candy{
	private int type;
	Dairymilk(int weight,int type){
		super(weight);
		this.type=type;
	}
	void display() {
		System.out.println("This is a DairyMilk");
		System.out.println(this.weight);
	}
}
abstract class Sweets{
	int weight;
	Sweets(int weight){
		this.weight=weight;
	}
	abstract void display();
}
class Rasgulla extends Sweets{
	private int type;
	Rasgulla(int weight,int type){
		super(weight);
	}
	void display() {
		System.out.println("This is a Rasgulla");
		System.out.println(this.weight);
	}
}
class Sandesh extends Sweets{
	private int type;
	Sandesh(int weight,int type){
		super(weight);
		this.type=type;
	}
	void display() {
		System.out.println("This is a Sandesh");
		System.out.println(this.weight);
	}
}


public class App 
{
    public static void main( String[] args )
    {
    	int n,i,x,p,w,tot=0;
    	System.out.println("Who many Gifts you want to send :");
    	Scanner sc=new Scanner(System.in);
    	n=sc.nextInt();
    	ArrayList<Sweets> arr1=new ArrayList<Sweets>(n);
    	ArrayList<Candy> arr2=new ArrayList<Candy> (n);
    	System.out.println("1. Add Sweets");
    	System.out.println("2. Add Candy");
    	for(i=0;i<n;i++) {
    		System.out.print("Enter Your Gift Choice: ");
    		x=sc.nextInt();
    		if(x==1) {
    			System.out.println("1. Rasgulla");
    			System.out.println("2. Sandesh");
    			System.out.print("Enter your choice: ");
    			p=sc.nextInt();
    			if (p==1) {
    				System.out.print("Enter weight: ");
    				w=sc.nextInt();
    				tot+=w;
    				Rasgulla obj1=new Rasgulla(w,1);
    				arr1.add(obj1);
    			}
    			else {
    				System.out.print("Enter weight: ");
    				w=sc.nextInt();
    				tot+=w;
    				Sandesh obj2=new Sandesh(w,1);
    				arr1.add(obj2);
    			}
    		}
    		else {
    			System.out.println("1.MilkyBar");
    			System.out.println("2.DairyMilk");
    			System.out.print("Enter Your Choice: ");
    			p=sc.nextInt();
    			if(p==1) {
    				System.out.println("Enter weight: ");
    				w=sc.nextInt();
    				tot+=w;
    				Milkybar obj1=new Milkybar(w,2);
    				arr2.add(obj1);
    			}
    			else {
    				System.out.println("Enter weight: ");
    				w=sc.nextInt();
    				tot+=w;
    				Dairymilk obj2=new Dairymilk(w,2);
    				arr2.add(obj2);
    			}
    		}
    	}
    	Collections.sort(arr2,new Comparator<Candy>(){
    		public int compare(Candy o1,Candy o2) {
    			return Integer.valueOf(o1.weight).compareTo(o2.weight);
    		}
    	});
    	System.out.println(arr1);
    	for(i=0;i<arr2.size();i++) {
    		System.out.println("Order:"+arr2.get(i).weight);
    	}
    	System.out.print("Total weight of the gifts is: "+tot);
    }
}
