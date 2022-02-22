package programmers.codingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SkillTrees {

	public static void main(String[] args) {
//		 System.out.println(solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
//		System.out.println(solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA", "AQWER" }));
//		System.out.println(solution("CBD", new String[] { "CED" }));
//		System.out.println(solution("CBD", new String[] { "AQBD" }));
//		System.out.println(solution("CBD", new String[] { "C" }));
		System.out.println(solution("ABC", new String[] { "OPQ" })); // 답 : 1 -> 스킬트리에 하나도 없는 스킬이면 +1
		System.out.println(solution("CBD", new String[] { "CXF", "ASF", "BDF", "CEFD" }));
	}

	/*
	 * 선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻합니다.
	 * 
	 * 예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 라이트닝 볼트를
	 * 배우려면 먼저 스파크를 배워야 합니다.
	 * 
	 * 위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다. 따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은
	 * 스킬트리는 가능하지만, 썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와 같은 스킬트리는 불가능합니다.
	 * 
	 * 선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때, 가능한 스킬트리 개수를
	 * return 하는 solution 함수를 작성해주세요.
	 */
	
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		Map<Character, Integer> skillMap = new HashMap<>();
		for(int i = 0; i < skill.length(); i++) {
			skillMap.put(skill.charAt(i), i);
		}
		
		System.out.println(skillMap.toString());
		
		// 모든 스킬트리 확인하기 위한 반복문
		for(int i = 0; i < skill_trees.length; i++) {
			String tree = skill_trees[i];
			List<Integer> result = new ArrayList<>();
			for(int j = 0; j < tree.length(); j++) {			
				if(skillMap.get(tree.charAt(j)) != null) {
					result.add(skillMap.get(tree.charAt(j)));
				}
			}
			System.out.println(result.toString());
			int num = -1;
			int count = 0;
			if(result.size() == 0) {
				answer++;
			}
			if(result.size() > 0 && result.get(0) == 0) {
				for(int j = 0; j < result.size(); j++) {
					if(result.get(j) - num == 1) {
						num = result.get(j);
						count++;
					}
				}
				answer += count == result.size()? 1: 0;
			}
		}

		return answer;
	}
}
