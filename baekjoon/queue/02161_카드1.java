package baekjoon.baekjoon_02161;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> card = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            card.offer(i+1);
        }

        while(true) {
            sb.append(card.poll()).append(" ");
            if(card.isEmpty()){
                break;
            }
            int topCard = card.poll();
            card.offer(topCard);
        }

        System.out.println(sb);

    }
}
