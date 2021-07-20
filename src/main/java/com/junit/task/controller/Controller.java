package com.junit.task.controller;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Controller {

	String Brand;
	String Mobile;
	Double price;
	int Id;
    int Str;
	AbstractCollection<String> al = new ArrayList<String>();
	private Object sc;
	
	
	
	 public Controller() {
		
	}

	public Controller(int id, String brand, String mobile, Double price) {
		
	}
	 
	 public String create()
	 {
		 try (Scanner sc = new Scanner(System.in)) 
		 {
				System.out.println("Enter Id");
				Id = sc.nextInt(); 
				
				System.out.println("Enter Brand");
				Brand = sc.toString();

				System.out.println("Enter Mobile");
				Mobile = sc.toString();
				
				System.out.println("Enter Price");
				price = sc.nextDouble();
		}
		 return "+Brand+Mobile+price";
	 }
	 	 
	public int read()
	{
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next() + "");
		}
		return Id;
	}	
	
	public String update()
	{
		Boolean found = false;
		System.out.println("Enter ID to Update :");
		try (Scanner s = new Scanner(System.in)) {
			int id = s.nextInt();
			Iterator<String> li = al.iterator();
			while(li.hasNext())
			{
			if(Id == id)
			   {
				System.out.println("Enter Brand");
				sc = null;
				Brand = sc.toString();

			    System.out.println("Enter Mobile");
			    Mobile = sc.toString();
			    
			    System.out.println("Enter Price");
			    price = ((Scanner) sc).nextDouble();
			    ((Controller) li).set(new Controller(id,Brand,Mobile,price));
				found = true;
			   }
			}
		}
		if(!found)
		{
			return "Record not Updated";
		}
		if(found)
		{
			return "Record Updated";
		}
		return null;
	}
	
	private void set(Controller controller) {
				
	}

	public String delete()
	{
		Boolean found = false;
		System.out.println("Enter ID to Delete :");
		try (Scanner s = new Scanner(System.in)) 
		{
			int id = s.nextInt();
			Iterator<String> itr = al.iterator();
			while(itr.hasNext())
			{
			if(Id == id)
			   {
				itr.remove();
				found = true;
			   }
			}
		}
		if(!found)
		{
			return "Record not deleted";
		}
		if(found)
		{
			return "Record Deleted";
		}
		return null;
	}

	
}	
