package java_assesment;
import java.util.*;
public class MapUses {

	    public static void main(String[] args) {
		        
		         HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		          hm.put(1,"combatmortal");    
		          hm.put(2,"Satish");    
		          hm.put(3,"sai");   
		           
		          System.out.println("\nThe elements of Hashmap are ");  
		          for(Map.Entry m:hm.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }
		              
		          Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		          ht.put(4,"vss");  
		          ht.put(5,"karan");  
		          ht.put(6,"mohan");  
		          ht.put(7,"Arun");  

		          System.out.println("\nThe elements of HashTable are ");  
		          for(Map.Entry n:ht.entrySet()){    
		           System.out.println(n.getKey()+" "+n.getValue());    
		          }
		          
		          TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		          map.put(8,"manoj");    
		          map.put(9,"bharath");    
		          map.put(10,"vinay");       
		          
		          System.out.println("\nThe elements of TreeMap are ");  
		          for(Map.Entry l:map.entrySet()){    
		           System.out.println(l.getKey()+" "+l.getValue());    
		          }    
		          
		       }  
	}
