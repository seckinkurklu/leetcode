package leetcode_questions;

import java.util.HashSet;
import java.util.Set;

public class Has_Duplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;


    }

}
