package com.company;

/* 이동 가능한 방향은 오직 오른쪽과 아래 뿐.
 그래프 탐색을 진행할 때 오른쪽과 아래에 대해서만 확인한다.
 승리지점(오른쪽 맨 아래 칸) = -1
 나머지 칸 = (0,100)
  */

import java.io.*;

public class boj_23854 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int winA = a / 3;
        int drawA = a % 3;
        int winB = b / 3;

        if (a % 3 == b % 3) {
            System.out.println(winA + " " + drawA + " " + winB);
        } else {
            System.out.println(-1);
        }
    }
}