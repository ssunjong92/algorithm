package baekjoon.baekjoon_01655;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            if(maxQueue.size() == minQueue.size()) {
                maxQueue.offer(Integer.parseInt(br.readLine()));
                if(!minQueue.isEmpty() && maxQueue.peek() > minQueue.peek()){
                    maxQueue.offer(minQueue.poll());
                    minQueue.offer(maxQueue.poll());
                }

            } else{
                minQueue.offer(Integer.parseInt(br.readLine()));
                if(maxQueue.peek() > minQueue.peek()){
                    maxQueue.offer(minQueue.poll());
                    minQueue.offer(maxQueue.poll());
                }
            }
            sb.append(maxQueue.peek()).append("\n");
        }
        System.out.println(sb);

    }
}
