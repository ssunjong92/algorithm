package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_01874 {
    public static void main(String args[]) throws Exception {

        // 변수 받아서 쓰려고 함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int line = Integer.parseInt(br.readLine());
        int index = 1;
        boolean err = false;

        Stack<Integer> stack = new Stack<>();


        for(int i = 0; i < line; i++) {
            int N = Integer.parseInt(br.readLine());

            for(; index <= N; index++) {
                stack.push(index);
                sb.append("+").append("\n");
            }
            if(stack.peek() == N) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                err = true;
                break;
            }
        }

        if(err) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }

    }
}
