import java.util.*;

public class Boj_1330 {
    /**
     * 두 수 비교하기 (B5)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B) {
            System.out.println(">");
        } else if(A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}