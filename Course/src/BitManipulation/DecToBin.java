package BitManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class DecToBin {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputNum = in.nextInt();
		
		findBinary(inputNum);
		
		int inputBinary = in.nextInt();
		findDec(inputBinary);
	}

	private static void findBinary(int inputNum) {
		ArrayList<Integer> binary = new ArrayList<>();
		while(inputNum!=0) {
			binary.add(inputNum%2);
			inputNum = inputNum/2;
		}
		
		
		for(int i=binary.size()-1;i>=0;i--) {
			System.out.print(binary.get(i));
		}
	}
	
	private static void findDec(int inputBinary) {
		int temp = inputBinary;
		int last = 0;
		int base = 0;
		int result = 0;
		while(temp>0) {
			last = temp%10;
			temp = temp/10;
			int pwr = 2^base;
			result =result + last*pwr;
			base++;
		}
		System.out.println(result);
		
		String anm = "1111";
		char[] ch = anm.toCharArray();
		long ans = Integer.parseInt(anm);
		
		
	}
	
	

}
