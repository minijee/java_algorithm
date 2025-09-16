import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Boj_1181 {
    /**
     * 단어 정렬 (S5)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Set<String> set = new HashSet<>();

        for(int i = 0; i < N; i++) {
             set.add(sc.next());
        }

        N = set.size();
        String[] arr = set.toArray(new String[0]);

        //알파벳 순 정렬
        Arrays.sort(arr);

        //길이 정렬
        for(int i = 0; i < N-1 ; i++) {
            for(int j = 0; j < N-1-i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    //swap
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(String str : arr) {
            System.out.println(str);
        }
    }
}
