import java.util.*;
public class treeseteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet<Integer> tset=new TreeSet<>();
      tset.add(20);
      tset.add(15);
      tset.add(30);
      tset.add(12);
      tset.add(35);
      tset.add(17);
      tset.add(18);
      
      for(int i:tset)
    	  System.out.println(i);
      
      
     /* TreeSet<String> tset1=new TreeSet<>();
      tset1.add("hello");
      tset1.add("Welcome");
      tset1.add("sai");
      tset1.add("Apple");
      tset1.add("Good");
      tset1.add("banana");
      tset1.add("Soap");
      
      for(String i:tset1)
    	  System.out.println(i);
      
     */ 
    TreeSet<Employee> elist=new TreeSet<>(new Employeeempidcomparator());
   	elist.add(new Employee(101,"Shiva",2000));
   	elist.add(new Employee(102,"Haerish",3000));
   	
   	
   	System.out.println(elist.add(new Employee(103,"Chandu",2000)));
   	for(Employee s:elist)
   		System.out.println(s);
	}

}
