package dsaClass;

public class EleminateEnemy {
	
	boolean killEnemy(String s[][], int row, int col) {
		int[] rs = new int[row]; int[] cls = new int[col];
		
		for(int i=0;i<row;i++){
			for(int j=0;i<col;j++){
				if(s[i][j] == B){
					rs[i]++;
				cls[j]++;
				}
				
			}
		}
		
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				if(s[i][j] == E){
					if(rs[i] == 0 && cls[j] ==0){
						return false;
					}
				
				}
			}
		}
		return true;

	}
	
	public static void main(String[] args) {
		
		
	}
}
