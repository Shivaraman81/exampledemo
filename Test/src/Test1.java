import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap<String,String> map=new HashMap<>();
   map.put("abc@gmail.com", "abc@123");
   map.put("wbc@gmail.com", "23c@123");
   map.put("zbc@gmail.com", "l2bc@123");
   map.put("fac@gmail.com", "a2c@123");
   map.put("abc@gmail.com","sjsks");
   
   /*System.out.println(map.size());
   System.out.println(map.isEmpty());
   
   map.clear();
   System.out.println(map.size());
   System.out.println(map.isEmpty());
   
   System.out.println(map.containsKey("abc@gmail.com"));
   System.out.println(map.containsValue("REdzeba"));
	
   System.out.println(map.remove("abc@gmail.com"));*/
   
   //System.out.println(map.get("abc@gmail.com"));
   
   /*	Set<String> set=map.keySet();
   	for(String s:set)
   		System.out.println(s+" "+map.get(s)); */
   
   /*Collection<String> col=map.values();
   for(String c:col)
	   System.out.println(c);*/
   
  /* Set<String> set=map.keySet();
   for(String s:set)
  		System.out.println(s+" "+map.get(s)); 
	}*/
   
   Set<Map.Entry<String,String>> set=map.entrySet();
   
   for(Map.Entry<String,String>s:set)
     System.out.println(s.getKey()+"   "+s.getValue());
	}
}	
