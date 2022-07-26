package Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_15829 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int M = 1234567891;
        long sum = 0;
        long pow = 1; // 거듭제곱
        // if abc -> 1*31 + 2 *31^2 + 3*31^3

        for (int i = 0; i<L; i++){
            sum += ((str.charAt(i)-'a'+1)*pow);
            pow = (pow * 31) % M;
        }
        System.out.println(sum % M);
    }
}

