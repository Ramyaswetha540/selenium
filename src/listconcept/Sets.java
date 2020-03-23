package listconcept;

import java.util.HashSet;
import java.util.Iterator;


public class Sets {
	
	public static void main(String[] args)
	{
	HashSet<String> set=new HashSet<String>();
	
	set.add("tom");
	set.add("micky");
	set.add("john");
	set.add("mouse");
	
	System.out.println(set.size());
	
	for(String s:set) {
		System.out.println(s);
	}
	
	System.out.println("==============");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	}

