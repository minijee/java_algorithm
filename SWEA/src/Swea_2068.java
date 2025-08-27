import java.util.Scanner;

public class Swea_2068 {
    /**
     * 최대수 구하기 (D1)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t = 1; t <= T; t++) {

            //배열 생성
            int N = 10;
            int[] arr = new int[N];

            //배열에 값 받기
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            //버블 정렬 : 한 회차마다 가장 큰 수가 가장 뒤로 고정된다.
            for(int i = N-1; i > 0; i--) { //N-1번 하면 자동 정렬된다. i 위치는 각 사이클에서 최대 데이터가 저장될 위치
                for(int j = 0; j < i; j++) { //가장 마지막은 건들이지 않겠다 (j < i)
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            //출력
            System.out.println("#" + t + " " + arr[N-1]);
        }

    }
}
