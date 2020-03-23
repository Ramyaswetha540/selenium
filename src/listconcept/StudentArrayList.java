package listconcept;

import java.util.ArrayList;
import java.util.Iterator;


//how to store class objects in arraylist
//how to print using ietrator
public class StudentArrayList {
	
	public static void main(String[] args)

	{
	
	//create class objects
	Student s1=new Student("tom",27,50,5,"jntu");
	Student s2=new Student("peter",28,60,6,"svsr");
	Student s3=new Student("john",29,55,7,"sri");
	Student s4=new Student("david",29,80,3,"jntu");
	Student s5=new Student("abc",27,50,2,"kits");
	Student s6=new Student("def",25,90,1,"kakathiya");
	
	//create one arraylist of student list
	
	ArrayList<Student> ar= new ArrayList<Student>();
	
	//adding student details to arraylist
	
	ar.add(s1);
	ar.add(s2);
	ar.add(s3);
	ar.add(s4);
	ar.add(s5);
	ar.add(s6);
	
	//to traverse use iterator -whileloop
	Iterator<Student> it=ar.iterator();
	 while(it.hasNext())
	 {
		 Student s=it.next();
		 System.out.println(s.name);
		 System.out.println(s.age);
		 System.out.println(s.marks);
		 System.out.println(s.rank);
		 System.out.println(s.collagename);
	 }
	
	
	

}
}