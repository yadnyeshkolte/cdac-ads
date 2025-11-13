package questions.threeproblems;

import java.util.*;

public class Padosan2 {
	Scanner s = new Scanner(System.in);

	private int[][] takeTable() {
		System.out.println("Enter the Number of Squares in the dig : ");
		int n = s.nextInt();
		int[][] arr = new int[n][8];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Coordinates for Square " + (i + 1) + " :(x1,y1,x2,y2,x3,y3,x4,y4)");
			for (int j = 0; j < 8; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}

	private void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private void checkAdjacent(int[][] arr) {
		int n = arr.length;
		int[][][] sides = new int[n][4][4]; // Each square has 4 sides, each side has 4 values: x1,y1,x2,y2
		// Step 1: Extract sides for each square
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 8; j += 2) {
				int x1 = arr[i][j];
				int y1 = arr[i][j + 1];
				int x2 = arr[i][(j + 2) % 8];
				int y2 = arr[i][(j + 3) % 8];
				// Normalize side: always store lower point first
				if (x1 < x2 || (x1 == x2 && y1 < y2)) {
					sides[i][j / 2] = new int[] { x1, y1, x2, y2 };
				} else {
					sides[i][j / 2] = new int[] { x2, y2, x1, y1 };
				}
			}
		}
		// Step 2: Compare sides to count adjacent squares
		for (int i = 0; i < n; i++) {
			int adjacentCount = 0;
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				for (int s1 = 0; s1 < 4; s1++) {
					for (int s2 = 0; s2 < 4; s2++) {
						if (areSidesEqual(sides[i][s1], sides[j][s2])) {
							adjacentCount++;
							s1 = 4; // break outer loop
							break;
						}
					}
				}
			}
			System.out.println((i + 1) + " " + adjacentCount);
		}
	}

	private boolean areSidesEqual(int[] side1, int[] side2) {
		return side1[0] == side2[0] && side1[1] == side2[1] && side1[2] == side2[2] && side1[3] == side2[3];
	}

	public static void main(String[] args) {
		Padosan2 P = new Padosan2();
		int[][] arr = P.takeTable();
		P.display(arr);
		System.out.println("The Output is As Follows : ");
		P.checkAdjacent(arr);
	}
}
