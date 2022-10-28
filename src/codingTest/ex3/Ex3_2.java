package codingTest.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex3_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // n m k 선언
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println("n ::: " + n);
        System.out.println("m ::: " + m);
        System.out.println("k ::: " + k);

        int[] nArr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
            System.out.println("nArr[i]  ::: " + nArr[i]);
        }

        Arrays.sort(nArr);

        System.out.println();
        System.out.println();
        System.out.println("nArr[0]  ::: " + nArr[0]);
        System.out.println("nArr[1]  ::: " + nArr[1]);
        System.out.println("nArr[2]  ::: " + nArr[2]);
        System.out.println("nArr[3]  ::: " + nArr[3]);
        System.out.println("nArr[4]  ::: " + nArr[4]);

        int lastNum = nArr[n - 1];
        int secondNum = nArr[n - 2];

        System.out.println();
        System.out.println();
        System.out.println("lastNum  ::: " + lastNum);
        System.out.println("secondNum  ::: " + secondNum);
        int result = 0;
        int cnt = 0;
        for (int j = 0; j < m; j++) {
            if (cnt == k) {
                result += secondNum;
                cnt = 0;
            } else {
                result += lastNum;
                cnt++;
            }
        }


        System.out.println("result :: " + result);

        // 1. 첫번째 큰수, 두번째 큰수 저장
        // 2. m번째까지 수를 합산, 최대 합산은 3번만 가능
        // 3. 연속3번 이후 다음 합산은 2번째 값으로 대체


        /*
        Scanner sc = new Scanner(System.in);

        // N, M, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        // N개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 입력 받은 수들 정렬하기
        int first = arr[n - 1]; // 가장 큰 수
        int second = arr[n - 2]; // 두 번째로 큰 수

        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);

        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (m - cnt) * second; // 두 번째로 큰 수 더하기

        System.out.println(result);
         */
    }
}
