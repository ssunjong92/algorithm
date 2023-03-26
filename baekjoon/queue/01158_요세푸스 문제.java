package baekjoon.baekjoon_01158;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static String COMMA = ", ";
    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            queue.offer(i+1);
        }
        sb.append("<");
        while(queue.size() != 1) {
            for(int i = 0; i < K-1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(COMMA);
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}
