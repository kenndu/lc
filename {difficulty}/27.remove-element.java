/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) continue;

            //search for the next elem in array that != val
            int dest = -1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] != val) {
                    dest = j;
                    break;
                }
            }

            //swap nums[i] and nums[dest]
            if (dest != -1) {
                int temp = nums[dest];
                nums[dest] = nums[i];
                nums[i] = temp;
            } else {
                //finished
                break;
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) break;

            count++;
        }

        return count;
    }
}
// @lc code=end

