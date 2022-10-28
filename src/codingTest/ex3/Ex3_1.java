package codingTest.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] coinArr = {500, 100, 50, 10};
        int cnt = 0;


        for (int i = 0; i < coinArr.length; i++) {
            System.out.println("arr ::: " + coinArr[i]);
            int coin = coinArr[i];
            cnt += n / coin;
            n %= coin;
        }
        System.out.println("cnt :::: " + cnt);
        System.out.println("n :::: " + n);
    }

    // 1. 최소카운트 구하는 것으로 500>100>50>10 순으로 카운트
    // 2. 잔액 % 거스름돈[i]
    // 3. for문 활용, cnt 활용
    // 4. 잔액 / 거스름돈[i]으로 최소 카운트 대입

}
