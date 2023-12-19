import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int index = 0;
		int count = jobs.length;
		int total = 0;
		int end = 0;

		// 1. Job start 시간으로 오름차순
		Job[] list = new Job[jobs.length];

		for(int i = 0; i < jobs.length; i++) {
			list[i] = new Job(jobs[i][0], jobs[i][1]);
		}

		Arrays.sort(list, new Comparator<Job>(){
			@Override
			public int compare(Job o1, Job o2) {
				if(o1.getStart() < o2.getStart()) {
					return -1;
				} else if(o1.getStart() > o2.getStart()) {
					return 1;
				} else {
					if(o1.getDuration() < o2.getDuration()) {
						return -1;
					} else if(o1.getDuration() > o2.getDuration()) {
						return 1;
					}
					return 0;
				}
			}
		});

		// 2. 작업 중일 때 대기 중인 작업 쌓을 큐
		PriorityQueue<Job> queue = new PriorityQueue<>();

		// 3. 반복문
		while(count > 0) {
			for(int j = index; j < list.length; j++) {
				if(list[j].getStart() < end) {
					queue.add(list[j]);
					index++;
				} else {
					break;
				}
			}

			if(queue.isEmpty()) {
				Job current = list[index];
				total += current.getDuration();
				end = current.getStart() + current.getDuration();
				index++;
			} else {
				Job current = queue.poll();
				total += end - current.getStart() + current.getDuration();
				end += current.getDuration();
			}
			count--;
		}
        
        return total / list.length;
    }
}

class Job implements Comparable<Job> {
    private int start;
    private int duration;
    
    public Job() {}
    
    public Job(int start, int duration) {
        this.start = start;
        this.duration = duration;
    }
    
    public int getStart() {
        return this.start;
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    @Override
    public int compareTo(Job job) {
       return this.duration > job.getDuration() ? 1 : -1;
    }
}