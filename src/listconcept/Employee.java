package listconcept;

public class Employee {
	//global variables
	String name;
	int age;       
	String dept;
	
	//constructor
	Employee(String name,int age,String dept){ //local variables here both variables are different
		 //we need to intialize local variables to globle using this keyword
		this.name=name;
		this.age=age;
		this.dept=dept;
		
	}

}
