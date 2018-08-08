import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		
		a[4][4] = 5;
		a[3][4] = 7;
		
		
		for (int[] innerArray: a) {
	        for(int data: innerArray) {
	           System.out.print(data + " ");
	        }
	        System.out.println("\n");
	}

}
}
