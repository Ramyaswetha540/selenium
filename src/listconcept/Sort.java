package listconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar=new ArrayList<String>();
		ar.add("a");
		ar.add("b");
		ar.add("m");
		ar.add("c");
		ar.add("g");
		
		Collections.sort(ar);
		Iterator<String> itr=ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
