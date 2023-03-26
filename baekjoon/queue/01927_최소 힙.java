package baekjoon.baekjoon_01927;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static String NEW_LINE = "\n";
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x == 0) {
                if(queue.isEmpty()) {
                    sb.append(0).append(NEW_LINE);
                } else {
                    sb.append(queue.poll()).append(NEW_LINE);
                }
            } else {
                queue.offer(x);
            }
        }
        System.out.println(sb);
    }
}

## 우선순위 큐를 선언해줄 때 Collections.reverseOrder() 추가 시 역순으로 우선순위 큐가 만들어진다.
