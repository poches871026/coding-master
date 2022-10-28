package codingTest.ex4;

import java.io.*;
import java.util.StringTokenizer;

public class Ex4_4 {

    public static int left(int d) {
        d = d - 1;
        if (d == -1) {
            d = 3;
        }
        return d;
    }

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println("n :: " + n + "\n" + "m :: " + m + "\n");
//        bw.write("n :: " + n + "\n" + "m :: " + m + "\n");
//
//
//        bw.flush();
//        bw.close();
        boolean chk = true;
        // 1번째줄 n  m 배열 구현
        int map[][] = new int[n][m];


        // 2번째 줄 현재 캐릭터의 X 좌표, Y 좌표, 방향을 입력받기
        st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        // 0 북 1서 2남 3동
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};

        // 3번째줄 전체 맵 정보를 입력 받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {

                int num = Integer.parseInt(st.nextToken());
                System.out.println("num :: " + num);
                if (j == 0 && num == 0) {
                    System.out.println("j == 0 // num == 0");
                    chk = false;
                }
                if (j == (m - 1) && num == 0) {
                    System.out.println("j == m // num == 0");
                    chk = false;
                }
                map[i][j] = num;
//                System.out.println("map :: i // " + i + " j // " + j + " :: " + map[i][j]);

            }
            System.out.println();
        }


        // 1. 카운트 표기
        int count = 1;
        int turn_time = 0;
        // 현재위치 현재방향에서 갈곳 정하기 시계반대방향으로
        // 현재위치 저장
        int[][] s = new int[n][m];
        s[x][y] = 1;

//        1. 현재 위치에서 현재 방향을 기준으로 왼쪽 방향(반시계 방향으로 90도 회전한 방향)부터 차례대로 갈 곳을 정한다.
//        2. 캐릭터의 바로 왼쪽 방향에 아직 가보지 않은 칸이 존재한다면, 왼쪽 방향으로 회전한 다음 왼쪽으로 한칸을 전진한다.
//        왼쪽 방향에 가보지 않은 칸이 없다면, 왼쪽 방향으로 회전만 수행하고 1단계로 돌아간다.
//        3. 만약 네 방향 모두 이미 가본 칸이거나 바다로 되어있는 칸인 경우에는, 바라보는 방향을 유지한 채로 한칸 뒤로 가고 1단계로 돌아간다. 단, 이때 뒤쪽 방향이 바다인 칸이라 뒤로 갈 수 없는 경우에는 움직임을 멈춘다.

        while (chk) {
            d = left(d);

            int nx = x + dx[d];
            System.out.println("nx :: " + nx);
            int ny = y + dy[d];
            System.out.println("ny :: " + ny);

            if (s[nx][ny] == 0 && map[nx][ny] == 0) {
                s[nx][ny] = 1;
                x = nx;
                y = ny;
                count += 1;
                turn_time = 0;
                continue;
            } else {
                // 회전한 이후 정면에 가보지 않은 칸이 없거나 바다인 경우
                turn_time = turn_time + 1;
            }
            // 네 방향 모두 갈 수 없는 경우
            if (turn_time == 4) {
                nx = x - dx[d];
                ny = y - dy[d];
                // 뒤로 갈 수 있다면 이동하기
                if (map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    // 뒤가 바다로 막혀있는 경우
                    break;
                }
                turn_time = 0;
            }
        }

        System.out.println("count :: " + count);
    }
}


