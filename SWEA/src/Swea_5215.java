import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Swea_5215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int TC = Integer.parseInt(br.readLine().trim()); // 테스트 케이스

        for(int t = 1; t <= TC; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //재료의 수
            int L = Integer.parseInt(st.nextToken()); //제한 칼로리

            int[] scoreArr = new int[N];
            int[] kcalArr = new int[N];

            //배열에 값 넣기
            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                scoreArr[i] = Integer.parseInt(st.nextToken());
                kcalArr[i] = Integer.parseInt(st.nextToken());
            }

            int maxScore = 0;
            for(int i = 0; i < (1 << N); i++) { //부분집합 수만큼 반복
                int sumKcal = 0;
                int max = 0;
                for(int j = 0; j < N; j++) { //배열만큼 반복
                    if((i & (1 << j)) != 0) { //배열 인덱스 값이 1이라면
                        sumKcal += kcalArr[j]; //총 칼로리
                        max += scoreArr[j]; //총 점수

                        if(sumKcal <= L && max > maxScore) { //제한 칼로리 이하이고 최대 점수이면
                            maxScore = max; //최대점수 변경
                        }
                    }
                }
            }

            System.out.println("#" + t + " " + maxScore);
        }

        bw.flush();
        bw.close();
        br.close();

    }
}