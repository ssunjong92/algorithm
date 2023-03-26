package baekjoon.baekjoon_01715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            queue.offer(Integer.parseInt(br.readLine()));
        }

        while(queue.size() > 1){
            int firstMin = queue.poll();
            int secondMin = queue.poll();
            sum += (firstMin + secondMin);
            queue.offer(firstMin + secondMin);
        }

        System.out.println(sum);

    }
}
