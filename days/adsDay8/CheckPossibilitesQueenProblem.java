package days.adsDay8;

import java.util.Arrays;

public class CheckPossibilitesQueenProblem {
	static int chessboardsize = 4;
	static int possibilits = 0;
 	public static void main(String[] args) {
		intializeMatrix();
	}
	
	static boolean checkGoodPlace(int[][] matrix, int row, int col) {
		
		//horizontal left
		for(int i=col; i>=0; i--) {
			if(matrix[row][i]==7) {
				return false;
			}
		}
		//horizonatal up
		for(int i=row, j=col; i>=0 && j>=0; i--, j--) {
			if(matrix[i][j]==7) {
				return false;
			}
		}
		//horizontal down
		for(int i=row, j=col; j>=0 && i<chessboardsize; i++, j--) {
			if(matrix[i][j]==7) {
				return false;
			}
		}
		return true;
	}
	
	static void selectLocation(int[][] matrix, int col) {
		if(col>=chessboardsize) {
			possibilits++;
			System.out.println("------------------");
			displayMatrix(matrix);
			System.out.println("------------------");
			return;
		}
		for(int i=0; i<chessboardsize; i++) {
			if(checkGoodPlace(matrix, i, col)) {
				matrix[i][col] = 7;
				
				selectLocation(matrix, col+1);
				
				matrix[i][col] = 0;
			}
		}
	}
	
	static void intializeMatrix() {
		int[][] matrix= {{0,0,0,0},
						{0,0,0,0}, 
						{0,0,0,0},
						{0,0,0,0}};
		
		selectLocation(matrix, 0);
		
		if(possibilits==0) {
			System.out.println("Error cannot able to put Queen");
			return;
		}
		else {
			System.out.println("Total count: "+possibilits);
			return;
		}
	}
	
	static void displayMatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++){
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
	
	
}