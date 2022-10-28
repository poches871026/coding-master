package codingTest.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3_4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        /*
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;

        // 1번 제약사항
        if (n % k > 0) {
            cnt++;
            n -= 1;
        }

        // 2번 n값이 1일때까지 반복 수행
        while (true) {
            n /= k;
            if (n == 1) {
                cnt++;
                break;
            } else {
                cnt++;
            }
        }

        System.out.println("cnt ::: " + cnt);
        */
        // 답안소스


        // N, K를 공백을 기준으로 구분하여 입력 받기
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result = 0;

        while (true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            int target = (n / k) * k;
            System.out.println("n / k :: " + n / k);
            System.out.println("target ::: (n / k) * k :: " + (n / k) * k);

            System.out.println("before  n :: " + n + " // " + "target :: " + target );
            result += (n - target);
            System.out.println("result += (n - target) :: " + result);
            n = target;
            System.out.println("n = target :: " + n + " // " + "target :: " + target );
            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            System.out.println();
            System.out.println();
            if (n < k) {
                break;
            }
            // K로 나누기
            result += 1;
            System.out.println("result += 1 :: " + result);
            n /= k;
            System.out.println("n /= k :: " + n + " // " + k);
        }

        // 마지막으로 남은 수에 대하여 1씩 빼기
        System.out.println();
        System.out.println();
        result += (n - 1);
        System.out.println("result += (n - 1) :: " + n);
        System.out.println(result);

    }
}
