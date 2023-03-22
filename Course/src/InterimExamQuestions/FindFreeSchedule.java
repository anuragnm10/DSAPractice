package InterimExamQuestions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FindFreeSchedule {
	
	static int hrs_in_a_day = 9;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfIntervals = in.nextInt();
		Interval[] arr = new Interval[noOfIntervals];
		for(int j=0;j<noOfIntervals;j++) {
			arr[j] = new Interval(in.nextInt(), in.nextInt());
		}
		
		System.out.println(mergeMeetings(arr));
		}

	private static int mergeMeetings(Interval[] arr) {
		List<Interval> list = new ArrayList<>();
		for(Interval l1 : arr) {
			list.add(l1);
		}
		Stack<Interval> stk = new Stack<>();
		Collections.sort(list, Comparator.comparingInt(a -> a.start));
		int hours = hrs_in_a_day;
		for(Interval curr : list) {
			if(stk.isEmpty() || curr.end > stk.peek().start) {
				stk.push(curr);
				continue;
			}
			
			if(stk.peek().end<curr.end) {
				stk.peek().end = curr.end;
			}
		}
		int count = 0;
		for(Interval in : list) {
			count += in.end - in.start;
		}
		
		
		return hours - count;
		
	}

}
