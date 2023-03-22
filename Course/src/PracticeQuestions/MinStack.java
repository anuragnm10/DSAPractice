package PracticeQuestions;

public class MinStack {
	
	final int max_size;
	static int top;
	int[] stack;
	
	public MinStack() {
		this.max_size = 5;
		this.top = -1;
        stack = new int[max_size];
    }
    
    public void push(int val) {
    	if(top>=max_size-1) {
    		System.out.println("Stack Overflow occurred!");
    	}else {
    		top++;
    		stack[top] = val;
    		System.out.println(val+" value pushed successfully into the stack!");
    	}
        
    }
    
    public void pop() {
    	if(top<0) {
    		System.out.println("Stack underflow occurred!");
    	}else {
    		int removedVal = stack[top];
    		top--;
    		System.out.println("Top elements popped successfully!");
    	}
        
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        int smallest = top;
        for(int i=0;i<stack.length;i++) {
        	if(smallest>stack[i]) {
        		smallest=stack[i];
        	}
        }
        
        return smallest;
    }
    
    public void printStackElements() {
        System.out.println("Elements in the stack from the top are ... :- ");
        for (int i = top; i > -1; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}
