package programmers.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Orders {
	public static void main(String[] args) {
		// solution(new String[]{"alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"});
		System.out.println(Arrays.toString(solution(new String[] {"alex pizza pasta steak", "bob noodle sandwich pasta", "choi pizza sandwich pizza", "alex pizza pasta steak"})));
	}

	/*
	 * 유저 ID와 각 유저가 주문한 음식이 문자열 형태로 들어있는 배열 orders가 매개변수로 주어질 때, 가장 많은 종류의 음식을 주문한
	 * 유저의 아이디를 배열에 담아 return 하도록 solution 함수를 완성해주세요. 만약, 그런 유저가 여러 명이면 해당 유저들을
	 * 오름차순으로 정렬해 return
	 */
	public static String[] solution(String[] orders) {
		Map<String, Set> map = new HashMap<>();

		for(int i = 0; i < orders.length; i++) {
			// 주문 전체 문자열
			String order = orders[i];
			
			// 유저와 주문을 분리
			String user = order.substring(0, order.indexOf(" "));
			Set orderSet = new HashSet<>(Arrays.asList(order.split(" ")));
			orderSet.remove(user);
			
			System.out.println(user);
			System.out.println(orderSet.toString());
			
			if(map.size() == 0) {
				map.put(user, orderSet);
			} else {
				Set getSet;
				if(map.get(user) != null) {					
					getSet = map.get(user);
				} else {
					getSet = new HashSet<>();
				}
				Iterator<String> itSet = orderSet.iterator();
				while(itSet.hasNext()) {
					String s = itSet.next();
					if(!getSet.contains(s)) {
						getSet.add(s);
					}
				}
				map.put(user, getSet);
			}			
		}
		
		// 최대 주문 수량
		int max = -1;
		// 각 유저의 주문 수량을 저장할 변수
		int size = 0;
		// 각 유저명을 저장할 변수
		String user = "";
		
		Iterator<String> iterator = map.keySet().iterator();
		List<String> _answer = new ArrayList<>();
		while(iterator.hasNext()) {
			user = iterator.next();
			size = map.get(user).size();
			System.out.println(size);
			System.out.println(max);
			if(size > max) {
				_answer = new ArrayList<>();
				_answer.add(user);
				max = size;
			} else if(size == max) {
				_answer.add(user);
			}
		}
		
		String[] answer = _answer.toArray(new String[0]);
		Arrays.sort(answer);
		
		return answer;
	}
}
