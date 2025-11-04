import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N과 M(2) (s1)
 */
public class Boj_15650 {
    static int N, M;
    static int[] arr;
    static int[] sel;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        sel = new int[M];

        for(int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        comb(0, 0);
    }

    private static void comb(int idx, int count) {
        //기저조건
        if(count == M) {
            for(int i = 0; i < M; i++) {
                System.out.print(sel[i] + " ");
            }
            System.out.println();
            return;
        }

        if(idx == N) {// 선택되지 않고 마지막에 도달했다면
            return;
        }

        //재귀파트
        //선택
        sel[count] = arr[idx];
        comb(idx + 1, count + 1); //다음으로 이동

        //비선택
        comb(idx + 1, count); //다음으로 이동

    }
}
