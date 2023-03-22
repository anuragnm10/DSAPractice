package dsaClass;

public class numRec {
	
	public static void main(String[] args) {
		int n = 10;
		printLoop(n);
		
		printrec(0);
		
	}

	private static void printrec(int n) {
		if(n<=10) {
			System.out.println(n);
			printrec(++n);
		}
		
		
	}

	private static void printLoop(int n) {
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
	}
	
	
	
	
	

}
