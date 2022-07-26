package com.company;
/* 이동 가능한 방향은 오직 오른쪽과 아래 뿐.
 그래프 탐색을 진행할 때 오른쪽과 아래에 대해서만 확인한다.
 승리지점(오른쪽 맨 아래 칸) = -1
 나머지 칸 = (0,100)
  */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_16174 {

    int[] dx = {0, 1}, dy = {1, 0};
    static int[][] arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {

        }


    }

    public static void dfs(int i, int j) {
        if (arr[i][j] == -1) { //승리지점
            System.out.println("HaruHaru");
        }
        for (int a = 0; a < 2; a++) {
            int x = i + 1;
        }

    }
}
