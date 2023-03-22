package _30thDecQuestion;
import java.util.*;

public class StackUsingQueue {
	
	
	Queue<Integer> q;
	public StackUsingQueue(){
		this.q = new LinkedList<>();
	}
	
	public void push(int x) {
		q.add(x);
		for(int i=0;i<q.size()-1;i++) {
			q.add(q.poll());
		}
		
	}
	
	public int pop() {
		return q.remove();
	}
	
	public int top() {
		return q.peek();
	}
	
	public int size() {
		return q.size();
	}
	
	public boolean isEmpty() {
		return q.isEmpty();
	}
	

}
