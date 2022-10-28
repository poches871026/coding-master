package codingTest.ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4_2 {

    public static void main(String[] args) throws IOException {


        String minHH = "00";
        String minMM = "00";
        String minSS = "00";

        String maxMM = "59";
        String maxSS = "59";

        String hh = "";
        String mm = "";
        String ss = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (!(n > 0 && n < 24)) {
            System.out.println("0보다 크거나 24보다 작아야 합니다.");
            return;
        }
        int count = 0;
        String time = "";

        for (int i = Integer.parseInt(minHH); i <= n; i++) {
            hh = String.valueOf(i);
            for (int j = Integer.parseInt(minMM); j <= Integer.parseInt(maxMM); j++) {
                mm = String.valueOf(j);
                for (int k = Integer.parseInt(minSS); k <= Integer.parseInt(maxSS); k++) {
                    ss = String.valueOf(k);
                    time = hh + mm + ss;
                    if (time.contains("3")) {
                        // contains("3")
//                    if (time.indexOf("3") >= 0) {
                        count++;
                    }
                }
            }
        }


        System.out.println("count ::: " + count);


    }
}
