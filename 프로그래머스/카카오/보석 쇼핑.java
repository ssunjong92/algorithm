package programmers_067258;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String args[]) {
		
		Solution sol = new Solution();
		String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
		int[] answer = sol.solution(gems);

		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
}

class Solution {
    public int[] solution(String[] gems) {
    	int[] answer = {};
    	answer = new int[2];
    	
        MakeRoot makeRoot = new MakeRoot();
        
        int bestRoot = 100000;
        
        for(int i = 0; i < gems.length; i++) {
        	Queue<String> rootQueue = makeRoot.make(gems);
        	int count = i;
        	while(rootQueue.size() != 0 && count < gems.length) {
        		if(rootQueue.contains(gems[count])) {
        			rootQueue.remove(gems[count]);
        		}
        		count++;
        	}
        	if(rootQueue.size() > 0) {
        		break;
        	}
        	
        	if(bestRoot > (count - i)) {
        		bestRoot = count - i;
        		answer[0] = i+1;
        		answer[1] = count;
        	}
        }
        
        return answer;
    }
}

class MakeRoot {
	public Queue<String> make(String[] gems) {
		Queue<String> queue = new LinkedList<String>();
        
        for(int i = 0; i < gems.length; i++) {
        	if(!queue.contains(gems[i])) {
        		queue.offer(gems[i]);
        	}
        }
        
        return queue;
	}
}

// 1차(2022-09-21) : 정확성 통과 // 효율성 실패(0/15)
