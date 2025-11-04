import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 부분수열의 합 (S1)
 */
public class Boj_1182 {
    static int[] arr;
    static int N;
    static int S;
    static boolean[] isSel;
    static int count; //해당하는 부분수열 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //정수의 개수
        S = Integer.parseInt(st.nextToken()); //정수

        arr = new int[N];
        isSel = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        subset(0);
        if(S == 0) count--; //공집합 처리
        System.out.println(count);


    }

    private static void subset(int idx) {
        //기저조건
        if(idx == N) { //인덱스 끝에 다다르면
            int sum = 0;
            for(int i = 0; i < N; i++) {
                if(isSel[i]) { //선택되었다면
                    sum += arr[i]; //더하기
                }//end if
            }//end for

            if(sum == S) count++;
            return;
        }

        //재귀파트
        isSel[idx] = true; //선택
        subset(idx + 1); //다음으로 이동
        
        isSel[idx] = false; //비선택
        subset(idx + 1); //다음으로 이동
    }

}
