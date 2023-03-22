package Queue;

import java.util.Stack;

public class QueueUsingStack {
	
	Stack<Integer> stk;
	Stack<Integer> stk2;
	
public QueueUsingStack() {
        stk = new Stack<>();
        stk2 = new Stack<>();
    }
    
    public void push(int x) {
        while(!stk.isEmpty()) {
        	stk2.push(stk.pop());
        }
        stk.push(x);
        while(!stk2.isEmpty()) {
        	stk.push(stk2.pop());
        }
    }
    
    public int pop() {
        return stk.pop();
    }
    
    public int peek() {
        return stk.peek();
    }
    
    public boolean empty() {
        return stk.isEmpty();
    }
	
}
