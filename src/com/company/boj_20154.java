package com.company;

/*
가톨릭대학교에 다니는 컴퓨터정보공학부 황톨릭은 코로나 때문에 슬퍼하는 친구들을 위해 게임을 하나 만들었다.

게임이 시작되면 알파벳 대문자로만 이루어진 문자열이 주어진다. 문자열이 주어지면 각 문자의 획수로 문자를 변환한다.
획수들을 갖고 앞에서부터 두 개씩 더해가는데 만약 짝이 지어지지 않는다면 그대로 다음 단계로 내려간다.
다음 단계부터는 이전 단계에서 두 개씩 더해가며 생성된 숫자들을 가지고 같은 과정을 반복한다. 과정을 반복하다가 결국 마지막 한 개의 수가 남았을 때 그 수가 홀수라면 이기는 것이고 짝수라면 지는 게임이다!!

예를 들어 "ABCDE"라는 문자열이 주어지면 ‘A’, ‘B’, ‘C’, ‘D’, ‘E’ 각 문자의 획수인 3, 2, 1, 2, 3으로 바꾸어 아래의 그림처럼 과정을 진행한다.
단, 계산할 때, 더한 값이 10을 넘는다면 10으로 나눈 나머지로 바꿔준다.

첫째 줄에 알파벳 대문자로만 이루어진 길이 K(1 ≤ K ≤ 1,000,000)인 문자열 S가 주어진다.

첫째 줄에 정답을 출력한다.

마지막으로 남은 수가 홀수라면 "I'm a winner!"를 출력하고 0이거나 짝수라면 "You're the winner?"를 출력한다.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_20154 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        int [] arr = {3,2,1,2,3,3,3,3,1,1,3,1,3,3,1,2,2,2,1,2,1,1,2,2,2,1};
        for (int i=0; i<str.length(); i++){
            sum += arr[(str.charAt(i)-'A')];
        }
        if(sum%2==0){
            System.out.println("You're the winner?");
        }else{
            System.out.println("I'm a winner!");
        }
    }
}
