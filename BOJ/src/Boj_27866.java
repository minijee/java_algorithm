import java.util.Scanner;

public class Boj_27866 {
	/**
	 * 문자와 문자열 (B5)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int idx = sc.nextInt() - 1;
		
		System.out.println(s.charAt(idx));
	}
}
