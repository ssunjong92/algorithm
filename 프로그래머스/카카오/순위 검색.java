import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		String[] info = {"java backend junior pizza 150",
						 "python frontend senior chicken 210",
						 "python frontend senior chicken 150",
						 "cpp backend senior pizza 260",
						 "java backend junior chicken 80",
						 "python backend senior chicken 50"};
		
		String[] query = {"java and backend and junior and pizza 100",
						  "python and frontend and senior and chicken 200",
						  "cpp and - and senior and pizza 250",
						  "- and backend and senior and - 150",
						  "- and - and - and chicken 100",
						  "- and - and - and - 150"};
		
		int[] answer = sol.solution(info, query);
		
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
	
}

class Solution {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        
        for(int i = 0; i < query.length; i++) {
        	int count = 0;
        	
        	Map<String, String> map = new HashMap<String, String>();
        	String[] standInfo = query[i].split(" and ");
        	map.put("lang", standInfo[0]);
        	map.put("dev", standInfo[1]);
        	map.put("ior", standInfo[2]);
        	map.put("food", standInfo[3].split(" ")[0]);
        	map.put("point", standInfo[3].split(" ")[1]);

        	for(int j = 0; j < info.length; j++) {
        		String[] personInfo = info[j].split(" ");
        		if(("-".equals(map.get("lang"))||map.get("lang").equals(personInfo[0]))
        		  && ("-".equals(map.get("dev"))||map.get("dev").equals(personInfo[1]))
        		  && ("-".equals(map.get("ior"))||map.get("ior").equals(personInfo[2]))
        		  && ("-".equals(map.get("food"))||map.get("food").equals(personInfo[3]))
        		  && (Integer.parseInt(map.get("point")) <= Integer.parseInt(personInfo[4]))) {
        			count++;
        		}
        	}
        	answer[i] = count;
        }
        
        return answer;
    }
}

// 22-
