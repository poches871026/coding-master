package codingTest.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3_3 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] card = new int[n][m];
        int result = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int min_value = 10001;
            for (int j = 0; j < m; j++) {
                card[i][j] = Integer.parseInt(st.nextToken());
                System.out.println("before min_value :: " + min_value);
                min_value = Math.min(min_value, card[i][j]);
                System.out.println("after min_value :: " + min_value);
                System.out.println();
                System.out.println();
            }
            // '가장 작은 수'들 중에서 가장 큰 수 찾기
            System.out.println("before result :: " + result);
            result = Math.max(result, min_value);
            System.out.println("after result :: " + result);
            System.out.println();
            System.out.println();
        }

        System.out.println("result ::: " + result);

    }
    // 1. 값 입력 받아 배열 셋팅
    // 2.math.max / min 사용해서 최소 값을 추출
}
