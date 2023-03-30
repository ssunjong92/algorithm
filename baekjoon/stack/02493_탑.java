package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_02493 {
    public static String SPACE = " ";
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Stack<Integer> answerSt = new Stack<>();
        Stack<Integer> tmpSt = new Stack<>();

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);
            while(!tmpSt.isEmpty() && (num >= Integer.parseInt(input[tmpSt.peek()]))) {
                tmpSt.pop();
            }

            if(tmpSt.isEmpty()) {
                answerSt.push(-1);
            } else {
                answerSt.push(tmpSt.peek());
            }
            tmpSt.push(i);
        }

        for(int i = 0; i < N; i++) {
            sb.append(answerSt.get(i)+1).append(SPACE);
        }

        System.out.println(sb);
    }
}
