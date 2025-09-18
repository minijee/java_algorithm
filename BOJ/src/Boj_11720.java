import java.util.Scanner;

public class Boj_11720 {
	/**
	 * 숫자의 합 (B4)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String str = sc.next();
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			int num = str.charAt(i) - '0';
			sum += num;
		}
		
		System.out.println(sum);
	}
}
