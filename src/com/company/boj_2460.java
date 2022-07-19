package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int people = 0;

        for(int i = 0; i<10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); // for문 안에 넣어야 10번 씀..
            int off = Integer.parseInt(st.nextToken());
            int on = Integer.parseInt(st.nextToken());
            people = people + on - off;

            max = Math.max(max, people); // if문 대신 이거 사용

        }
        System.out.println(max);
    }
}
