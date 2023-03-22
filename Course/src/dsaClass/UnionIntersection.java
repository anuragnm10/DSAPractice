package dsaClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class UnionIntersection {
	
	public static void main(String[] args) {
		
		int[] A = {1,3,4,5,7};
		int[] B = {1,3,8,10};
		
		findUnion(A,B);
		findInter(A,B);
	}

	private static void findUnion(int[] a, int[] b) {
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		
		for(int j=0;j<b.length;j++) {
			set.add(b[j]);
		}
		
		System.out.println("Union : ");
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}
	
	private static void findInter(int[] a, int[] b) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for(int m=0;m<a.length;m++) {
			set1.add(a[m]);
		}
		
		for(int n=0;n<b.length;n++) {
			if(set1.contains(b[n])) {
				set2.add(b[n]);
			}
		}
		
		Iterator<Integer> itr = set2.iterator();
		System.out.println();
		System.out.println("Intersection : ");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
	
	

}
