package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_09012 {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        boolean err = false;

        for(int i = 0; i < N; i++) {
            Stack<Character> st = new Stack<>();
            String vps = br.readLine();

            for(int j = 0; j < vps.length(); j++) {
                if(vps.charAt(j) == '(') {
                    st.push('(');
                } else {
                    if(st.isEmpty()) {
                        err = true;
                        break;
                    }
                    st.pop();
                }
                err = false;
            }
            if(err) {
                sb.append("NO").append("\n");
            } else {
                if(st.isEmpty()) {
                    sb.append("YES").append("\n");
                } else {
                    sb.append("NO").append("\n");
                }
            }
        }

        System.out.println(sb);

    }
}
