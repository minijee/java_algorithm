import java.util.Scanner;

public class Boj_2562 {
	/**
	 * 최댓값 (B3)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for(int i = 1; i <= 9; i++) {
			int num = sc.nextInt();
			if(num > max) {
				max = num;
				idx = i;
			}
		}
		
		System.out.println(max);
		System.out.println(idx);
	}
}
