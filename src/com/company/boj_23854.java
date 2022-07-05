package com.company;

/* 승 패 무승부가 존재
 이기면 3점 지면 0점 비기면 서로 1점
 예시 : 승무승(a):패무패(b) = 7 : 1
 출력 : 2 1 0
 무조건 처음에 점수 높은 팀 입력
 a,b팀 점수를 입력 받고, 점수를 계산 후 a팀 점수, 드로우, b팀 점수를 출력하고 계산이 불가능하면 -1을 출력 */

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