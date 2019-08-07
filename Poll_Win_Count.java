package com.Collection;
kkkk
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Poll_Win_Count {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Jessy");
		list.add("Philip");
		list.add("Jessy");
		list.add("Philip");
	
		
		
//		Iterator itr= list.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		for(String str:list){
			
		}
		
		
			Map<String,Integer> map= new HashMap<String,Integer>();

			for(String str1:list){
				
				if (map.containsKey(str1)) {
		            map.put(str1, map.get(str1) + 1);
		         } else {
		            map.put(str1, 1);
		         }
			}
	int max = 0; 
	        String winner = ""; 
	        for (Map.Entry<String,Integer> entry : map.entrySet()) 
	        { 
	            String key  = entry.getKey(); 
	       	            Integer val = entry.getValue(); 
	        
	            if (val > max) 
	            { 
	                max = val; 
	                winner = key; 
	            } 
	            else if (val == max && 
	                    winner.compareTo(key) > 0) 
	                    winner = key; 
	            } 
	            System.out.println(winner); 
	        }
	        
			
	}


