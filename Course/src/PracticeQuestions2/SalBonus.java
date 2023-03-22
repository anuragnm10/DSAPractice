package PracticeQuestions2;
import java.util.*;

public class SalBonus {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salary = in.nextDouble();
		int yearOfExp = in.nextInt();
		
		System.out.println(calBonus(salary, yearOfExp));
	}

	private static double calBonus(double salary, int yearOfExp) {
		double bonus = 0;
		double netBonus = 0;
		if(yearOfExp>5) {
			bonus = (salary*5)/100;
			netBonus = bonus*12;
		}
		
		return netBonus;
		
	}

}
