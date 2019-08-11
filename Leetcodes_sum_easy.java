package text;

import java.util.HashMap;
import java.util.Map;

public class Leetcodes_sum_easy {
	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	public static void main(String args[]) {
		int nums[] =new int[]{1,2,3,4,5,6,7,8,9};
		Leetcodes_sum_easy lcs = new Leetcodes_sum_easy();
		int[] id = lcs.twoSum(nums,10);
		System.out.println(id[0]+" "+id[1]);
	}

}
