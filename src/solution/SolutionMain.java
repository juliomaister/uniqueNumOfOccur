package solution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SolutionMain {

	public static void main(String[] args) {
		int[] numsArr = {1,2,2,1,1,3};
		System.out.println(uniqueOccurrences(numsArr));
	}
	
    public static boolean uniqueOccurrences(int[] arr) {
    	Map<Integer, Integer> countMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
        	if (countMap.containsKey(arr[i])) {
        		countMap.put(arr[i], countMap.get(arr[i]) + 1);
			}else {
				countMap.put(arr[i], 1);
			}
        }
        Iterator<Entry<Integer, Integer>> iterator = countMap.entrySet().iterator();
        while (iterator.hasNext()) {
        	Map.Entry<Integer, Integer> entry = iterator.next();
			iterator.remove();
			if (countMap.containsValue(entry.getValue())) {
				return false;
			}	
		}
        return true;
      }

}
