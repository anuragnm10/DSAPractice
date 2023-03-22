package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String input =" a good   example";
		
		String res = reverse(input);
		System.out.println(res);
	}

	private static String reverse(String input) {
		List<String> list = new ArrayList<>();
		String[] arr = input.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			if(!arr[i].isBlank())
				list.add(arr[i]);
		}
		
		String result = String.join(" ",list);
		
		return result;
		
	}

}
