package Queue;

public class main {
	
	public static void main(String[] args) {
		
		QueueUsingStack qus = new QueueUsingStack();
		qus.push(0);
		qus.push(1);
		qus.push(2);
		
		System.out.println(qus.pop());
		System.out.println(qus.peek());
		System.out.println(qus.empty());
	}

}
