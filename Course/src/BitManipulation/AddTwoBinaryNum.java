package BitManipulation;

public class AddTwoBinaryNum {
	
	public static void main(String[] args) {
		
		String a = "0011";
		String b = "0001";
		
		
		System.out.println(addBinary(a,b));
	}

	private static String addBinary(String a, String b) {
		int ans1 = convertToDec(a);
		int ans2 = convertToDec(b);
		int res = ans1 + ans2;
		String result = String.valueOf(convertToBinary(res));
		return result;
	}
	
	public static int convertToDec(String num){
        long binary = Integer.parseInt(num);
        int ans = 0;
        int count = 0;
        while(binary>0){
            int temp = (int)(binary%10);
            double pwr = Math.pow(2, count);
            ans += temp*pwr;
            count++;
            binary = binary/10;
        }
        
        return ans;
    }
	
	public static long convertToBinary(int num) {
		long result = 0;
		
		while(num>0) {
			result = (result*10)+(num%2);
			num = num/2;
		}
		
		return result;
	}

}
