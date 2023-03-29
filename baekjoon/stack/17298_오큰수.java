package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_17298 {
    public static String SPACE = " ";
    public static void main(String args[]) throws Exception {
        // 사용할 함수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 변수 설정
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> tmpSt = new Stack<>();
        Stack<Integer> answerSt = new Stack<>();
        String[] input = br.readLine().split(" ");

        for(int i = N-1; i >= 0; i--) {
            int num = Integer.parseInt(input[i]);

            while(!tmpSt.isEmpty() && (num >= tmpSt.peek())) {
                tmpSt.pop();
            }

            if(tmpSt.isEmpty()) {
                answerSt.push(-1);
            } else{
                answerSt.push(tmpSt.peek());
            }
            tmpSt.add(num);
        }

        while(!answerSt.isEmpty()){
            sb.append(answerSt.pop()).append(SPACE);
        }
        System.out.println(sb);

    }
}
