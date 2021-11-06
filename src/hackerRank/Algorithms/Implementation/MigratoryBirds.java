package hackerRank.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		int[] test = new int[] {1, 4, 4, 4, 3, 5};
		for(int a : test) {
			arr.add(a);
		}
		System.out.println(migratoryBirds(arr));
	}

	public static int migratoryBirds(List<Integer> arr) {
        int[] count = new int[5];
        
        for(Integer i : arr) {
            count[i-1]++;
        }
        int result = count[0];
        int submit = 0;
        
        for(int i = 1; i < count.length; i++) {
            if(result < count[i]) {
                submit = i;
                result = count[i];
            }
        }
        
        return submit + 1;
    }
}
