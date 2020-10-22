import java.util.Arrays;

public class Tester {
	public static void main(String[] args) {
		int[][]  A  =  {  {1,2,3,4},
                  { 2,3,4,1},
                  { 3,4,1,2}
               	};
		int[]  B  =   {  1, 3, 5 };
		int[][] C ={{1,1,1},
					{2,2,2},
					{3,3,3}}; 
		int [][] D = { {  2,  2, 2 },
   						{  2, 2, 2 } };
   		int [][] E = {{  2,  4, 2 }, 
						{  2, 2, 2 } };
		System.out.println((ArrayOps.isLocationMagic(E,0,1)));
	}
}