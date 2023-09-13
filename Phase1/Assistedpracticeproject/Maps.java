package assistedPracticeProject1;

import java.util.*;

public class Maps {
	public static void main(String[] args) {
		
		//Hashmap
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Surya ");    
	      hm.put(2,"Praksh");    
	      hm.put(3,"Yadav k");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry <Integer,String> m:hm.entrySet()){ 
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Rohith");  
	      ht.put(5,"Kishan");  
	      ht.put(6,"Pavan");  
	      ht.put(7,"Tejas");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry <Integer,String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Ravan");    
	      map.put(9,"Nitin ");    
	      map.put(10,"Hardik");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry <Integer,String> l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}