import java.util.*;
public class Test {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
     //type inference 
	  /*LinkedList<String> slist=new LinkedList<>();
	  slist.add("HEllo");
	  slist.add("Welcome");
	  slist.add("Bye Bye");
	  slist.add(2,"Third Element");
	  for(int i=0;i<slist.size();i++)
		  System.out.println(slist.get(i));
	  
	  ListIterator<String> itr=slist.listIterator();
	  while(itr.hasNext())
		  System.out.println(itr.next());
	  while(itr.hasPrevious())
		  System.out.println(itr.previous());*/
		
	LinkedList<Employee> elist=new LinkedList<>();
	elist.add(new Employee(101,"Shiva",2000));
	elist.add(new Employee(102,"Haerish",3000));
	
	System.out.println(elist.contains(new Employee(102,"Hariesh",3000)));
	System.out.println(elist.remove(new Employee(102,"Hariesh",3000)));
    	
	
	}

}
