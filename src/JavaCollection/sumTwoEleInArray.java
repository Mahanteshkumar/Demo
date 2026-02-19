package JavaCollection;

import java.util.HashSet;
import java.util.Set;

public class sumTwoEleInArray {

	public static void main(String[] args) {

	}
	
	public int solution(int[] a) {
        Set<Long> set = new HashSet<>();
        for (int num : a) {
            set.add((long) num);
        }
        
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                long needed = (long) a[i] + a[j];
                if (set.contains(needed)) {
                    count++;
                }
            }
        }
        return count;
    }

}
