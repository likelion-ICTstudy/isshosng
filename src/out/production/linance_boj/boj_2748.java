package out.production.linance_boj;

import java.io.*;
public class boj_2748{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        int n = Integer.parseInt(str);
        long[] dp;

        dp = new long[n+1]; // n+1만큼 dp 배열 선언

        dp[0] = 0; // 첫 번째 배열
        dp[1] = 1; // 두 번째 배열
        // Fn = Fn-1 + Fn-2 (n ≥ 2)

        for (int i=2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2]; // 피보나치 수열 식을 배열로 정의했음
        }

        bw.write(String.valueOf(dp[n]));


        bw.flush();
        br.close();
    }
}