package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_10799 {
    public static void main(String arg[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pipeLine = br.readLine();
        Stack<Character> st = new Stack<>();

        int sum = 0;

        for(int i = 0; i < pipeLine.length(); i++) {
            if(pipeLine.charAt(i) == '(') {
                st.add(pipeLine.charAt(i));
            } else {
                st.pop();
                if (pipeLine.charAt(i-1) == '(') {
                    sum += st.size();
                } else {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}
