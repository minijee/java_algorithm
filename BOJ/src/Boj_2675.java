import java.util.Scanner;

public class Boj_2675 {
	/**
	 * 문자열 반복 (B2)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			String str = sc.next();
			
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				for(int j = 0; j < N; j++) {
					System.out.print(c);
				}
			}
			
			System.out.println();
		}
		
	}
}
