package codingTest.ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4_3 {

    public static void main(String[] args) throws IOException {
        // ex4_1 유사
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int arr = Integer.parseInt(br.readLine());

        int[][] map = new int[8][8];
        int mapX = 0;
        int mapY = 0;

        String n = br.readLine();
        System.out.println("map 로우 :: " + map.length);
        System.out.println("map 컬럼 :: " + map[0].length);

        System.out.println("n :: " + n);


        char ch = n.charAt(0);
        int n1 = ch;
        int n2 = Integer.parseInt(String.valueOf(n.charAt(1)));
        System.out.println("n1 :: " + n1);
        System.out.println("n2 :: " + n2);


        if (!(n1 > 96 && n1 < 105)) {
            System.out.println("a, b, c, d, e, f, g, h 만 입력가능합니다.");
            return;
        }


        if (!(n2 > 0 && n2 < 9)) {
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8 만 입력가능합니다.");
            return;
        }


        // 1. 수평 두칸 이동(오), 수직한칸 (위)
        // 2. 수평 두칸 이동(오), 수직한칸 (아래)
        // 3. 수평 두칸 이동(왼), 수직한칸 (위)
        // 4. 수평 두칸 이동(왼), 수직한칸 (아래)
        // 5. 수평 한칸(왼), 수직 두칸 이동(위)
        // 6. 수평 한칸(왼), 수직 두칸 이동(아래)
        // 7. 수평 한칸(오), 수직 두칸 이동(위)
        // 8. 수평 한칸(오), 수직 두칸 이동(아래)

        int count = 0;
        while (true) {

            // 1. 수평 두칸 이동(오), 수직한칸 (위)
            if ((n1 >= 97 && (n1 + 2) < 105) && (n2 - 1) > 0) {
                count++;
                System.out.println("1. 수평 두칸 이동(오), 수직한칸 (위)");
            }
            // 2. 수평 두칸 이동(오), 수직한칸 (아래)
            if ((n1 >= 97 && (n1 + 2) < 105) && ((n2 + 1) < 9)) {
                count++;
                System.out.println("2. 수평 두칸 이동(오), 수직한칸 (아래)");
            }
            // 3. 수평 두칸 이동(왼), 수직한칸 (위)
            if (((n1 - 2) >= 97) && (n2 - 1) > 0) {
                count++;
                System.out.println("3. 수평 두칸 이동(왼), 수직한칸 (위)");
            }

            // 4. 수평 두칸 이동(왼), 수직한칸 (아래)
            if (((n1 - 2) >= 97) && ((n2 + 1) < 9)) {
                count++;
                System.out.println("4. 수평 두칸 이동(왼), 수직한칸 (아래)");
            }

            // 5. 수평 한칸(왼), 수직 두칸 이동(위)
            //System.out.println("5. 1 :: " + (n1 - 1));
            //System.out.println("5. 2 :: " + (n2 - 2));
            if (((n1 - 1) >= 97) && (n2 - 2) > 0) {
                count++;
                System.out.println("5. 수평 한칸(왼), 수직 두칸 이동(위)");
            }
            // 6. 수평 한칸(왼), 수직 두칸 이동(아래)
            //System.out.println("6. 1 :: " + (n1 - 1));
            //System.out.println("6. 2 :: " + (n2 + 2));
            if (((n1 - 1) >= 97) && (n2 + 2) < 9) {
                count++;
                System.out.println("6. 수평 한칸(왼), 수직 두칸 이동(아래)");
            }
            // 7. 수평 한칸(오), 수직 두칸 이동(위)
//            System.out.println("7. 1 :: " + (n1 < 105));
//            System.out.println("7. 2 :: " + (n2 - 2));
            if (((n1 + 1) < 105) && (n2 - 2) > 0) {
                count++;
                System.out.println("7. 수평 한칸(오), 수직 두칸 이동(위)");
            }

            // 8. 수평 한칸(오), 수직 두칸 이동(아래)
            if (((n1 + 1) < 105) && (n2 + 2) < 9) {
                count++;
                System.out.println("8. 수평 한칸(오), 수직 두칸 이동(아래)");
            }
            break;
        }

        System.out.println("count :: " + count);

    }
}
