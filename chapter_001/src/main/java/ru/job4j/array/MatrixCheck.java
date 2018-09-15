package ru.job4j.array;

/**
 * Class for checking of matrix.
 * 
 * @author makkez
 * @version 1.0
 * @since 15.09.2018
 */
public class MatrixCheck {
	
	/**
	 * Checks all elements by diagonals of matrix is true or false.
	 *
	 * @param data Matrix containing boolean elements.
	 * @return When diagonals of matrix has true or false only (same value) 
	 * then returns true, when diagonal of matrix has different value 
	 * or matrix isn`t square then false.
	 */
	public boolean mono(boolean[][] data) {
		boolean result = true;
		boolean firstValue = data[0][0];
		boolean secondValue = data[0][data.length - 1];	
		result = topDiagonal(data, firstValue);
		result = bottomDiagonal(data, secondValue);
		return result;
	}
	
	private boolean topDiagonal(boolean[][] data, boolean checking) {
		boolean result = true;
		for (int i = 0; i < data.length; i++) {
			if (data[i][i] != checking) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	private boolean bottomDiagonal(boolean[][] data, boolean checking) {
		boolean result = true;
		int column = data[0].length - 1;
		for (int i = 0; i < data.length; i++) {
			if (data[i][column] != checking) {
				result = false;
				break;
			}
			column--;
		}
		return result;
	}
	
	/*public static void main(String[] args) {
		MatrixCheck check = new MatrixCheck();
		boolean[][] input = {
			{true, true, true},
			{false, true, true},
			{true, false, true}
		};
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
		boolean result = check.mono(input);
		System.out.println(result);
	}*/
}