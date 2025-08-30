import java.util.Scanner;

public class Swea_1984 {
    /**
     * 중간 평균값 구하기 (D2)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t = 1; t <= T; t++) {
            int N = 10;
            int[] arr = new int[N];

            //배열에 값 받기
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            //버블정렬
            for(int i = N-1; i > 0; i--) { //N-1만큼 반복, i는 최대값이 저장될 위치
                for(int j = 0; j < i; j++) { //i가 9일 때는 8까지 > 인덱스 8 과 9를 비교!
                    if(arr[j] > arr[j+1]) { //swap!
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            //평균값 구하기
            int sum = 0;
            for(int i = 1; i < N-1; i++) {
                sum += arr[i];
            }

            //출력하기
            System.out.println("#" + t + " " + Math.round(sum/8.0));
        }

    }
}
