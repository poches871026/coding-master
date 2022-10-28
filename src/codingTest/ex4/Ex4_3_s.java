package codingTest.ex4;

import java.util.Scanner;

public class Ex4_3_s {


    public static void main(String[] args) {
        // ex4_1 유사
        Scanner sc = new Scanner(System.in);

        // 현재 나이트의 위치 입력받기
        String inputData = sc.nextLine();
        // 줄
        // 핵심
        int row = inputData.charAt(1) - '0';
        System.out.println("inputData.charAt(1) :: " + inputData.charAt(1));
        // 열
        // 핵심
        int column = inputData.charAt(0) - 'a' + 1;
        System.out.println("inputData.charAt(0) :: " + inputData.charAt(0));
        System.out.println("inputData.charAt(0) - a :: " + (inputData.charAt(0) - 'a'));

        System.out.println("row :: " + row);
        System.out.println("column :: " + column);

        // 나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        int result = 0;
        for (int i = 0; i < 8; i++) {
            // 이동하고자 하는 위치 확인
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            // 해당 위치로 이동이 가능하다면 카운트 증가
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1;
            }
        }

        System.out.println(result);
    }


}
