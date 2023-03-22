package PracticeQuestions;

public class FirstAndLastEle {
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,2,2,2,3,4};
		int target = 2;
		
		int[] res = findFirst(arr, target);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		
	}

	private static int[] findFirst(int[] nums, int target) {
		int[] result = new int[2];
        boolean flag = false;
		int first = 0;
		int last = 0;
        
        if(nums.length<1 || nums.length==0){
            first = -1;
            last = -1;
        }else{
            for(int i=0; i<nums.length;i++) {
				if(flag == false) {
					if(nums[i] == target) {
						first = last = i;
						flag = true;
					}else {
						first = -1;
						last = -1;
					}
				}else {
					if(nums[i] == target) {
						last = i;
					}else if(last < first) {
						last = first;
					}
				}
            }
        
    }
        result[0] = first;
        result[1] = last;
        
        return result;  
            
}
}
