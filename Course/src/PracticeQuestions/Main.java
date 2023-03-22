package PracticeQuestions;

public class Main {
	public static void main(String[] args) {
		LRUCache lru = new LRUCache(2);
		
		lru.put(2, 1);
		lru.put(1, 1);
		lru.put(2, 3);
		lru.put(4, 1);
		System.out.println(lru.get(1));
		System.out.println(lru.get(2));

		
		
	}
}
