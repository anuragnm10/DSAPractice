package dsaClass;
	
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static void reverse(int[] arr, int size){
        int index = size-1;
        for(int j=index;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
        
    }
    
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    
	    while(t-->0){
	        int size = in.nextInt();
    	    int[] arr = new int[size];
    	    for(int i=0;i<size;i++){
    	         arr[i] = in.nextInt();
    	    }
    	    
    	    reverse(arr, size);
	    }
	    
	}
}


