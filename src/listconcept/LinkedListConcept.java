package listconcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	public static void main(String[] args)
	{
		//creating linked list of string type
		
		LinkedList<String> ll=new LinkedList<String>();
		
		//adding elements using add()
		 ll.add("tom");
		 ll.add("peter");
		 ll.add("john");
		 ll.add("johny");
		 ll.add("rubee");
		 ll.add("max");
		 
		 System.out.println("contents of the list"+ll);
		 
		 //addFirst()
		 
		 ll.addFirst("micky");
		 
		 //addLast()
		 
		 ll.addLast("minnie");
		 
		 System.out.println("contents of the list"+ll);
		 
		 //get()
		 System.out.println(ll.get(0));
		 
		 //removeFirst and removeLast methods
		 
		 ll.removeFirst();
		 ll.removeLast();
		 
		 System.out.println("contents of the list"+ll);
		 
		 //set()-add the new element in to the list based on index
		 
		 ll.set(0, "element");
		 
		System.out.println(ll.get(0));
		//if you want petlicular element to delete
		
		ll.remove(2);
		System.out.println("contents"+ll);
		
		//if you want to iterate i.e to print all the elements in the list
		// for loop
		
		System.out.println("******using for loop");
		
		for (int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
 //enhanced r advanced for loop
		System.out.println("****using advance for loop");
		for(String str:ll)// as we kmow the generic it iterates one by one
		{
			System.out.println(str);
		}
		//using iterator
		System.out.println("****using iterator");
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}
		//using while loop
		System.out.println("***using while loop");
		
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
	}

}
