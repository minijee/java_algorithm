import java.util.Scanner;

public class Boj_10952 {
	/**
	 * A+B - 5 (B5)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
	
			if (A == 0)
				return;
	
			System.out.println(A + B);
		}
	}
}
