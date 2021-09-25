import java.util.*;
public class hashseteg {
 public static void main(String[] args)
 {
	 /*HashSet<String> set=new HashSet<>();
     set.add("Yup");
     set.add("Bye");
     set.add("Hi");
     set.add("Welcome");
     set.add("hello");
     System.out.println(set.add("Hello"));
     
     
     for(String s:set)
    	 System.out.println(s);
     
     Iterator<String> itr=set.iterator();
     while(itr.hasNext())
    	 System.out.println(itr.next());*/
     
    HashSet<Employee> elist=new HashSet<>();
 	elist.add(new Employee(101,"Shiva",2000));
 	elist.add(new Employee(102,"Haerish",3000));
 	
 	
 	System.out.println(elist.add(new Employee(103,"Chandu",2000)));
 	for(Employee s:elist)
 		System.out.println(s);
 }
}
