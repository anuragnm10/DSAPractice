package PracticeQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	final int capacity;
	int lruKey;
	Map<Integer,Integer> lrukey = new HashMap<>();
	Map<Integer, Integer> map = new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
        	int val = map.get(key);
        	System.out.println("Key found!");
        	if(lrukey.containsKey(key)) {
        		int max = Collections.max(lrukey.values());
        		lrukey.replace(key, max+1);
        	}
            return val;
        }
        System.out.println(key+" key not found!");
        return -1;
    }
    
    public void put(int key, int value) {
    	int maxVal = 0;
    	int minKey = 0;
    	for(Map.Entry<Integer, Integer> lruEle : lrukey.entrySet()) {
    		if(lruEle.getValue() == Collections.max(lrukey.values())) {
    			maxVal = lruEle.getValue();
    		}
    		
			if(lruEle.getValue() == Collections.min(lrukey.values())) {
    			minKey = lruEle.getKey();
    		}else {
    			if(!map.containsKey(lruEle.getKey())) {
    				lrukey.remove(lruEle.getKey());
    			}
    			
    		}
    	}
    	
    	if(map.containsKey(key)) {
    		map.replace(key, value);
    		lrukey.replace(key, maxVal+1);
    	}else {
    		if(map.size()==1 && capacity==1) {
        		map.remove(lruKey);
        		lrukey.remove(lruKey);
        		map.put(key, value);
        	}else if(map.size()>=capacity) {
            	map.remove(minKey, map.get(minKey));
            	lrukey.remove(minKey);
            	map.put(key, value);
            }else {
            	map.put(key, value);
            }
    		lrukey.put(key, maxVal  +1);
    	}
    	lruKey = key;
        
    }

}
