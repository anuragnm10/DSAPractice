package PracticeQuestions;

public class ValidSudoku {
	
	public static void main(String[] args) {
		
		String[][] input = 	{{"8","3",".",".","7","3",".",".","."}
							,{"6",".",".","1","9","5",".",".","."}
							,{".","9","8",".",".",".",".","6","."}
							,{"8",".",".",".","6",".",".",".","3"}
							,{"4",".",".","8",".","3",".",".","1"}
							,{"7",".",".",".","2",".",".",".","6"}
							,{".","6",".",".",".",".","2","8","."}
							,{".",".",".","4","1","9",".",".","5"}
							,{".",".",".",".","8",".",".","7","9"}};
		
		System.out.println(validateSudoku(input));
								
		}

	private static boolean validateSudoku(String[][] input) {
		
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[i].length;j++) {
				if(i!=j && !input[i][j].equals(".")) {
					if(input[i][i].equals(input[i][j])) {
						return false;
					}
//					if(input[i][i].equals(input[j][i])) {
//						return false;
//					}
				}
			}
		}
		return true;
	}
		
	

}
