public class ArrayOps {

	//Returns the sum of a 1d array
	public static int sum(int[] arr) {
		int output = 0;
		for (int i = 0; i<arr.length; i++) {
			output += arr[i];
		}
		return output;
	}

	//Returns the largest value in 1d arraw
	public static int largest(int[]arr) {
		int output = arr[0];
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]>output) {
				output = arr[i];
			}
		}
		return output;
	}

	//Returns a 1d array of all the sums of each row in a 2d array
	public static int[] sumRows(int[][] matrix) {
		int[] output = new int[matrix.length];
		for (int rows = 0; rows<matrix.length; rows++) {
			output[rows] = sum(matrix[rows]);
		}
		return output;
	}

	//Returns a 1d array of all the largest values in each row of a 2d array
	public static int[] largestInRows(int[][] matrix) {
		int[] output = new int[matrix.length];
		for (int rows = 0; rows<matrix.length; rows++) {
			output[rows] = largest(matrix[rows]);
		}
		return output;
	}

	//Returns the sum of all values in a 2d array
	public static int sum(int[][] arr) {
		int output = 0;
		for (int rows = 0; rows<arr.length; rows++) {
			output += sum(arr[rows]);
		}
		return output;
	}


	//Returns true if each row of a 2d array are equal
	public static boolean isRowMagic(int[][] matrix) {
		int rowSum = sum(matrix[0]);
		for (int row = 0;row<matrix.length;row++) {
			if (sum(matrix[row])!=rowSum) {
				return false;
			}
		}
		return true;
	}


	//Returns true if each col of a 2d array are equal
	public static boolean isColMagic(int[][] matrix) {
		boolean first = true;
		int finalSum = 0;
		int colSum = 0;
		for (int col = 0; col<matrix[0].length; col++) {
			for (int row = 0; row<matrix.length; row++) {
				colSum += matrix[row][col];
			}
			if (first) {
				finalSum = colSum;
				first = false;
			} else if (finalSum != colSum) {
				return false;
			}
			colSum = 0;
		}
		return true;
	}



	//Returns true if the sum of a specific row is equal to the sum of a specific col
	public static boolean isLocationMagic(int[][] matrix, int row, int col) {
		int rowSum = sum(matrix[row]);
		int colSum = 0;
		for (int row1 = 0; row1<matrix.length; row1++) {
			colSum += matrix[row1][col];
			}
		return (rowSum==colSum);
	}

}