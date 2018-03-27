package project;

import java.util.*;

public class File {
	public static void main(String args[]) {

	 LinkedList<String> list=new LinkedList<String>(); 
	  list.add("Ravi");  
	  list.add("Vijay");  
	  list.add("Ravi");  
	  list.add("Ajay");  
	  
	  //ListIterator<String> itr=list.listIterator(); 
	  Iterator itr=list.iterator();  
	  System.out.println(list.get(2));
	  while(itr.hasNext()){  
	   System.out.println(itr.next());}
	  System.out.println(list);

	 System.out.println(list);

	  for(String obj:list) {
		  System.out.println(obj);
		  //new file
	  }
}}
