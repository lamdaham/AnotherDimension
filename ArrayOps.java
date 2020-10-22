public class ArrayOps {


	public static int sum(int[] arr) {
		int output = 0;
		for (int i = 0; i<arr.length; i++) {
			output += arr[i];
		}
		return output;
	}


	public static int largest(int[]arr) {
		int output = arr[0];
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]>output) {
				output = arr[i];
			}
		}
		return output;
	}


	public static int[] sumRows(int[][] matrix) {
		int[] output = new int[matrix.length];
		for (int rows = 0; rows<matrix.length; rows++) {
			output[rows] = sum(matrix[rows]);
		}
		return output;
	}


	public static int[] largestInRows(int[][] matrix) {
		int[] output = new int[matrix.length];
		for (int rows = 0; rows<matrix.length; rows++) {
			output[rows] = largest(matrix[rows]);
		}
		return output;
	}

	public static int sum(int[][] arr) {
		int output = 0;
		for (int rows = 0; rows<arr.length; rows++) {
			output += sum(arr[rows]);
		}
		return output;
	}


	public static boolean isRowMagic(int[][] matrix) {
		int rowSum = sum(matrix[0]);
		for (int row = 0;row<matrix.length;row++) {
			if (sum(matrix[row])!=rowSum) {
				return false;
			}
		}
		return true;
	}

}