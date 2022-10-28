package codingTest.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex5_10 {

    public static int n;
    public static int m;

    public static int[][] map;

    public static int result = 0;

    public static boolean mapCheck(int i, int j) {

        // 상하좌우 값보고 리턴 해야할거 함;
        if (i <= -1 || i >= n || j <= -1 || j >= m) {
            return false;
        }
        /*
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;

        // 상
        top = map[i - 1][j];
        // 하
        bottom = map[i + 1][j];
        // 좌
        left = map[i][j - 1];
        // 우
        right = map[i][j + 1];

        if (top == 0 || bottom == 0 || left == 0 || right == 0) {
            return true;
        }
         */

        // 현재 노드를 아직 방문하지 않았다면
        if (map[i][j] == 0) {
            // 해당 노드 방문 처리
            System.out.println("map[i][j] before :: " +map[i][j]);
            map[i][j] = 1;
            System.out.println("map[i][j] aft :: " +map[i][j]);
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            mapCheck(i - 1, j);
            mapCheck(i, j - 1);
            mapCheck(i + 1, j);
            mapCheck(i, j + 1);
            return true;
        }

        return false;


    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        System.out.println("n :: " + n);
        System.out.println("m :: " + m);

        System.out.println("row :: " + map.length);
        System.out.println("colrum :: " + map[0].length);


        // 배열에 값 넣기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            /* 1번 방법
            String temp = st.nextToken();

            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(temp.substring(j, j + 1));
                System.out.println("map[ " + i + " ]" + " [ " + j + " ] :: " + map[i][j]);
                }
             */

            // 2번방법
            String temp = st.nextToken();
            for (int j = 0; j < m; j++) {

                // charAt은 자바에 문자열에 index값을 통해 문자를 읽어오는 방법
                // 근데 우리는 1이 필요합니다. 49에서 1이 되기 위해서는 48을 빼줘야 합니다.
                // 그래서 - '0'을 해주는 것 입니다. '0'은 아스키코드 48 입니다.
                map[i][j] = temp.charAt(j) - '0';
                System.out.println("map[ " + i + " ]" + " [ " + j + " ] :: " + map[i][j]);
            }
        }

        //

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 체크로직
                if (mapCheck(i, j)) {
                    result++;
                }
            }
        }

        System.out.println("result :: " + result);
    }

}
