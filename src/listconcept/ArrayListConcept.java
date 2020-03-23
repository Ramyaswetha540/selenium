package listconcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	public static void main(String[] args)
	
//arraylist is dynamic
	//it maintains insertion
	//it can contain duplicate values
	//it allows to maintain random access to fetch the 
	//elements because it stores the values based on indexes
	//it is not synchronised
	{
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(10);//add is used to add numbers or strings to the arrylist
		ar.add(20);//you need to mention generics i.e data type to the arrylist
		ar.add(30);
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.get(2));
		
		ArrayList<String> ar1= new ArrayList<String>();
		ar1.add("test");
		ar1.add("qa");
		ar1.add("tom");
		System.out.println(ar.size());
		
		//to print all the values of the array list we need to use for loop
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		//arraylist can store userdefined class objects 
	//HOW TO STORE CLASS OBJECTS INTO ARRAYLIST?	
		
		//create  employee class objects
		
		Employee e1=new Employee("naveen",27,"qa");//here we need to pass the values
		Employee e2=new Employee("tom",28,"admin");
		Employee e3=new Employee("peter",29,"test");
		
		// we need to create an array list of employee type(generic)
		
		ArrayList<Employee> ar2=new ArrayList<Employee>();
		//adding employee objects to array list
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		 //use iterator to traverse the value
		//ar2.iterator();
		//employee reference iterator variable should store this
		//Iterator to use traverse the values we use while loop
		
		Iterator<Employee> it=ar2.iterator();
		while(it.hasNext()) {
			//it.Next();this should be store in some employee
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
	
			System.out.println("************");
			
			//addAll() 
			//create arraylist example
			 ArrayList<String> ar3= new ArrayList<String>();
				ar3.add("test");
				ar3.add("qa");
				ar3.add("tom");
				ar3.add("peter");
				
				ArrayList<String> ar4= new ArrayList<String>();
				ar4.add("test");
				ar4.add("selenium");
				ar4.add("tom");
				
				ar3.addAll(ar4);//ar4 list is added to ar3
				for (int j=0;j<ar3.size();j++)
				{
					System.out.println(ar3.get(j));
				}
				System.out.println("*******");
				
				//removeAll()
				ar3.removeAll(ar4);
				for(int j=0;j<ar3.size();j++)
				{
				System.out.println(ar3.get(j));	
				}
				System.out.println("*****");
				
				//retainAll() method
				
				ar3.retainAll(ar4);
				for(int j=0;j<ar3.size();j++)
				{
				System.out.println(ar3.get(j));	
				}
				
				
		}
			
	}

}
