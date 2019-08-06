package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class SortArray {

	public static void main(String[] args) {
		
		int[] arr={4, 5, 7, 7, 6, 5, 4, 3};
	
		List<Integer> lst =new ArrayList<Integer>();
		for(Integer i:arr){
			lst.add(i);	
			System.out.print("hi");
		}
		
	Collections.sort(lst);	
		 
		Map<Integer, Integer> map=new HashMap<Integer,Integer>();
		for(Integer i: lst){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}
			else
			{
			map.put(i,1);
			}
		}
	
		int  ky=0;
		int value=0;
		Set<Entry<Integer, Integer>> st= map.entrySet();
		
		for(Map.Entry<Integer, Integer> en:st){
			if(en.getValue()<2){
		System.out.print(en.getKey());
		System.out.print(" ");
		
		}
			
		}
		 int min=1;int k=0;int j=0;
		do{
			min++;
		 for (Map.Entry<Integer, Integer> entry : map.entrySet()){
			value=entry.getValue();
			if(entry.getValue()==min){
				ky=entry.getKey();
				for(int i=0;i<min;i++){
					System.out.print(ky);
					System.out.print(" ");
				}
				
			}
			
		}
			j++;
		}while(j<=st.size());	
	}

}
