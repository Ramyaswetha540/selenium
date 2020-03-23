package listconcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {
	public static void main(String[] args)

	{
	//hashmap object we should mention generic of key and value
		
		HashMap<Integer,String> h=new HashMap<Integer,String>(); 
		
		//adding data in form of key and value
		
		 h.put(1,"tom");
		 h.put(2,"john");
		 h.put(3,"value");
		 h.put(4,"jack");
		 
		 //display using key value
		 
		 System.out.println(h.get(2));
		 //to print all using advance for loop 
		 // hash map obj.entryset() to display
		 //key.getkey()
		 //key.getvalue
		 
		 for(Entry m: h.entrySet())//import entry for java util map
		 {
			System.out.println(m.getKey()+" "+m.getValue()); 
		 }
		 //remove()
		 h.remove(2);
		 System.out.println(h); 
		 //2nd key is removed but the position not stored by others
		 //it doesnt maintain ordering
		 
	//how to create class objects in haspmap and display all the elements using key and value
		 //example take Employee class which is already created
		 //first create one more haspmap object of key=integer value=employee
		 //employee type -because it contains the details of all employee as we required employee details we need to mention employee as a value
		 
		 HashMap<Integer,Employee> hm=new HashMap<Integer,Employee>();
		 
		 //create employee objects as we did in array list concept
		 
		 Employee e1=new Employee("tom",27,"java");
		 Employee e2=new Employee("jack",23,"qtp");
		 Employee e3=new Employee("jim",27,"rft");
		 Employee e4=new Employee("john",27,"javascript");
		 Employee e5=new Employee("max",27,"c#");
		 
	//we need to put the employee details to hasmap usong put()
		 
		 hm.put(1,e1);
		 hm.put(2, e2);
		 hm.put(3,e3);
		 hm.put(4,e4);
		 hm.put(5,e5);
		 //to traverse we need to use advance for loop
		 
		 for(Entry<Integer,Employee> m :hm.entrySet()) {
			 
			 //get key getkey()
			int key= m.getKey();
			Employee e=m.getValue();
			System.out.println("employee"+" "+key+" "+"info:");//printing key values
		
			System.out.println(e.name+" "+e.age+" "+e.dept);//as the complete entry set of employee details is stored in e
			 
		 }
	

	}

}

//haspmap is to store the data inform of keys and values
//it is non synchronised -in multi threading env every  thread can access the hasmap object-not threadsafe
//performace will be better as each access symutaneously
//it contains only unique elements
//hashmap is a class implements Map interface
//hashmap extends abstractionmap
//it may have one null key and num of null values
//it maintains no order
//no indexes here

//concurrentModificationException-False fast condition it means
//when any thread adding or removing the values of the 
//key sametime councurrently other thread want to access that time it gets this exception


//we use in multithreading to increase the performace



