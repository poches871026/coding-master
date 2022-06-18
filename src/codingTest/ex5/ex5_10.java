package codingTest.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex5_10 {

    public static void factorial() {

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int[][] map = new int[n][m];

        System.out.println("n :: " + n);
        System.out.println("m :: " + m);

        System.out.println("row :: " + map.length);
        System.out.println("colrum :: " + map[0].length);


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                System.out.println("map[ " + i + " ]" + " [ " + j + " ] " + map[i][j]);
            }
        }


    }

}
