package com.junit.task.controller;

import java.util.Scanner;

public class Crudmain extends Controller
{
    public static void main(String[] args) 
	{
    	String choice; 
    	try (Scanner UserInput = new Scanner(System.in)) {
			System.out.println("\nHere are your options:");
			System.out.println("\n1. Create, 2. Read, 3. Update, 4. Delete");
			choice = UserInput.next();
		}
        switch(choice)
	    
	    {
	    case "1":
	    	Controller cr = new Controller();
	    	cr.create();
	        
	    break;
	     
	    case "2":
	    	Controller re = new Controller();
	        re.read();
	    break;
	    
	    case "3":
	    	Controller up = new Controller();
	        up.update();
	    break;
	    
	    case "4":
	    	Controller de = new Controller();
	        de.delete();
	    break;
	
	    default:
	    System.out.println("");
	 
	    }

    }
}
