package com.vstl.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	//link list 
	public List<String> GetEmployeeDetails() {
		
	try {List<String> objLinklist=new LinkedList<String>();
	objLinklist.add("Name-Prathamesh");
	objLinklist.add("City-Pune");
	objLinklist.add("Branch-Civil");
	objLinklist.add("Age-28");
	objLinklist.add("Experienced");
	
	System.out.println("Print Employee Details"+objLinklist.toString());
	System.out.println("get employee:"+objLinklist.getClass());
	System.out.println("get employee:"+objLinklist.get(1));
	return objLinklist;	
	} catch (Exception exception) {
		System.out.println("i got exception :"+exception.getMessage());
		System.out.println("i got exception :"+exception.getClass());
		System.out.println("i got exception :"+exception.equals("Branch-Civil"));
		
		exception.printStackTrace();
		return null;
	}
	}
	//linked hash set
	public void Alphabets() {
		LinkedHashSet<Character> objlinkedHashSet=new LinkedHashSet<Character>();
		
		objlinkedHashSet.add('A');
		objlinkedHashSet.add('B');
		objlinkedHashSet.add('C');
		objlinkedHashSet.add('D');
		objlinkedHashSet.add('E');
		objlinkedHashSet.add('F');
		objlinkedHashSet.add('G');
		objlinkedHashSet.add('A');
		objlinkedHashSet.add('E');
		objlinkedHashSet.add('T');
		objlinkedHashSet.add('U');
		 
		System.out.println("Alphabets Character:"+objlinkedHashSet.toString());
		 	
		
	}

	//Array list
	public void FruitesName(){
		 ArrayList<String> ArrayList=new ArrayList<String>();//Creating arraylist
		 ArrayList.add("Mango");
		 ArrayList.add("Apple");
		 ArrayList.add("Banana");
		 ArrayList.add("Grapes");
		 System.out.println("Fruits Name:"+ArrayList);
		 System.out.println("Fruits size:"+ArrayList.size());
		 System.out.println("Fruits size:"+ArrayList.remove(2));
		 }  
	
	//Hash set
   public void EmployeeList() {
		HashSet<String> objset=new HashSet<String>();
		 objset.add("Sneha");
		 objset.add("prachi");
		 objset.add("Janvi");
		 objset.add("Gouri");
		 objset.add("chaitali");
		 objset.add("Smita");
		 objset.add("Smita");
		 System.out.println("list of Women Employee:"+objset.toString());
		 System.out.println("list of Women Employee:"+objset.parallelStream());
     } 
   //Hash Table
   public void StudentNameAndRollNo() {
	Hashtable<String, Integer> Hashtable=new Hashtable<String, Integer>(); 
	
	Hashtable.put("Chaitali", 34);
	Hashtable.put("Rohini", 36);
	Hashtable.put("Priyanka", 45);
	Hashtable.put("Aditi", 46);
	Hashtable.put("Ekta", 56);
	Hashtable.put("Deepika", 34);
	
	System.out.println(Hashtable);
	System.out.println(Hashtable.get("Chaitali"));
	Hashtable.remove("Ekta");
	System.out.println(Hashtable);
	System.out.println(Hashtable.containsKey("Priyanka"));
	System.out.println(Hashtable.containsValue(45));
	System.out.println(Hashtable.isEmpty());
	System.out.println(Hashtable.keySet());
    }

    //Hash map
   public void SubjectAndTheoryMarks() {
	HashMap<String,Double> HashMap=new HashMap<String,Double>();
	HashMap.put("Mathamatics", 97.45);
	HashMap.put("Science", 92.5);
	HashMap.put("History", 93.13);
	HashMap.put("Marathi", 98.45);
	HashMap.put("Hindi", 91.45);
	HashMap.put("English", 91.45);
	
	System.out.println(HashMap.get("Science"));
	System.out.println(HashMap.hashCode());
	System.out.println(HashMap.containsKey("Mathamatics"));
	System.out.println(HashMap.containsKey("Biology"));
	
}
	}

