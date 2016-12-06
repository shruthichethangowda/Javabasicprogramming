package com.tOString;

public class Student {
	  
		 int rollno;  
		 String name;  
		 String city;  
		  
		 Student(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		 // @overriding
		  
		 public String toString(){ 
		  return rollno+" "+name+" "+city;  

}
}