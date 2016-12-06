package com.thiskeyword;

public class student14 {
	 
	    int id;  
	    String name;  
	    String city; 
	    String college;
	      
	    student14(int id,String name,String city){  
	    this.id = id;  
	    this.name = name; 
	    this.city=city;
	    
	    }  
	    student14(int id,String name,String city,String college){  
	    this(id,name,college); 
	    this.city=city;  
	    }  
	    void display()
	    {
	    	System.out.println(id+" "+name+" "+city+" "+college);
	    		
	    }
}

