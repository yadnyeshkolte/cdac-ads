package backtracking;

import java.util.Arrays;

public class FourQueenProblem {
	static int chessboardsize = 4;
	public static void main(String[] args) {
		FourQueenProblem queen = new FourQueenProblem();
		queen.intializeArray();
		
	}
	
	boolean placeQueen(int[][] matrix, int row, int col){
		// horizontal left
		for(int i=col; i>=0; i--) {
			if(matrix[row][i]==1) {
				return false;
			}
		}
		//horizontal up
		for(	int i=row, j=col; i>=0 && j>=0; i--, j--) {
			if(matrix[i][j]==1) {
				return false;
			}
		}
		
		//horizontal down
		for(int i=row, j=col; i<chessboardsize && j>=0; i++, j--) {
			if(matrix[i][j]==1) {
				return false;
			}
		}
		return true;
	}
	boolean locationSelect(int[][] matrix, int col) {
		if(col>=chessboardsize) {
			return true;
		}
		for(int i=0;i<chessboardsize;i++) {
			if(placeQueen(matrix, i, col)) {
				matrix[i][col] = 1;
				if(locationSelect(matrix, col+1)){
					return true;
				}
				matrix[i][col] = 0;
			}
		}
		return false;
	}
	boolean intializeArray() {
		int[][] matrix = {{0,0,0,0},
						{0,0,0,0},
						{0,0,0,0},
						{0,0,0,0}};
		if(locationSelect(matrix, 0)==false) {
			System.out.println("Cannot able to put Queens properly");
			return false;
		}
		displayMatrix(matrix);
		return true;
	}
	void displayMatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
