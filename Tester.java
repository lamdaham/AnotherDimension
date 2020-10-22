import java.util.Arrays;

public class Tester {
	public static void main(String[] args) {
		int[][]  A  =  {  {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               	};
		int[]  B  =   {  1, 3, 5 };
		int[][] C ={{1,3,4,5},
					{2,4,5},
					{2,7,3}}; 
		System.out.println((ArrayOps.sum(A)));
	}
}