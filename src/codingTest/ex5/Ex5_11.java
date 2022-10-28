package codingTest.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex5_11 {

    public static int n, m;

    public static int[][] map;

    public static int result = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        String temp;
        // 1. 배열에 값넣기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            temp = st.nextToken();

            for (int j = 0; j < m; j++) {
                map[i][j] = temp.charAt(j) - '0';
                System.out.println("mpa :: " + map[i][j]);
            }
        }
        // 2. 배열 호출 및 미로 체크


    }
}
