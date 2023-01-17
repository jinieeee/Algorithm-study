import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new LinkedList<>();
        Map<String, String> termsMap = new HashMap<>();
        for(int i = 0; i < terms.length; i++) {
            String[] splitResult = terms[i].split(" ");
            termsMap.put(splitResult[0], splitResult[1]);
        }

        String[] sToday = today.split("\\.");

        int iToday = Integer.parseInt(sToday[0]) * 28 * 12
                    + Integer.parseInt(sToday[1]) * 28 
                    + Integer.parseInt(sToday[2]);
        
        for(int i = 0; i < privacies.length; i++) {
            String[] privacyResult = privacies[i].split(" ");
            String type = privacyResult[1];
            String[] date = privacyResult[0].split("\\.");
            int expDate = Integer.parseInt(date[0]) * 28 * 12
                        + Integer.parseInt(date[1]) * 28
                        + Integer.parseInt(date[2])
                        + Integer.parseInt(termsMap.get(type)) * 28 - 1;
            
            if(iToday > expDate) {
                answer.add(i + 1);
            }
            
        }
        
        return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}