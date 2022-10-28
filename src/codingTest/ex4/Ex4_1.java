package codingTest.ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4_1 {


    public static void main(String[] args) throws IOException {
        // ex4_3 유사
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int map1 = 1;
        int map2 = 1;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            String move = st.nextToken();
            System.out.println("move :: " + move);

            if (move.equals("L")) {
                if (map2 < 1) {
                    map2 = map2 - 1;
                }
            } else if (move.equals("R")) {
                if (map2 < 5) {
                    map2 = map2 + 1;
                }
            } else if (move.equals("U")) {
                if (map1 < 1) {
                    map1 = map1 - 1;
                }
            } else if (move.equals("D")) {
                if (map1 < 5) {
                    map1 = map1 + 1;
                }
            }

        }

        System.out.println("map1 :: " + map1);
        System.out.println("map2 :: " + map2);

        System.out.println(map1 + " " + map2);
    }
}
