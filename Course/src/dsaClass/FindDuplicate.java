package dsaClass;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,2,4,2,1,5,6,6,8,5};
		
		finddup(arr);
	}

	private static void finddup(int[] arr) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
//			if(map.containsKey(arr[i])) {
				int temp = map.get(arr[i]) != null?map.get(arr[i])+1:0;
				map.put(arr[i], temp+1);
//			}+
//			else {
//				map.put(arr[i], 1);
//			}
		}
		
		int count = 0;
		
		for(Map.Entry<Integer, Integer> currEle : map.entrySet()){
			int val = currEle.getValue();
			if(val>1)
				count++;
			
		}
		System.out.println(count);
		
	}

}
