

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RedDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4, 5, 5, 6, 6, 6};
		System.out.println("print Array");
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]);
				System.out.print(" ");
			}
			System.out.println("");
		
		Set<Integer> set = new HashSet<Integer>();
		for(Integer i:arr){
			set.add(i);
		}
//		System.out.println(set);
		
		int a= set.size();
		Integer k[] = new Integer[a];
		int p=0;
		for(Integer j:set){
			k[p++]=j;
		}
		System.out.println("Remove duplicate Element and print");
		
		System.out.println(Arrays.toString(k));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<=arr.length-1;i++){
			list.add(arr[i]);
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer i:list){
			
			if(map.containsKey(i)){
				map.put(i,map.get(i)+1);
		 		
			}
			else{
				map.put(i,1);
			}
		}
		System.out.println("Count duplicate Elements");
		System.out.println(map);
		System.out.println("Print only Duplicate Elements");
		//int k=1;
		for(Map.Entry<Integer, Integer> mp :map.entrySet()){
			if(mp.getValue()>1){
				System.out.println(mp.getKey());
			}
		}
	}

}
