/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
import java.util.ArrayList;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        int p1 = 0;
        int p2 = 0;
        while (p1 < m && p2 < n) {
            if (nums1[p1] < nums2[p2]) {
                temp.add(Integer.valueOf(nums1[p1]));
                p1++;
            } else {
                temp.add(Integer.valueOf(nums2[p2]));
                p2++;
            }
        }

        //copy the rest of nums1 or nums2 into temp
        if (p1 == m) {
            //nums1 done
            for (int j = p2; j < n; j++) {
                temp.add(nums2[j]);
            }
        } else {
            for (int j = p1; j < m; j++) {
                temp.add(nums1[j]);
            }
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp.get(i);
        }
    }
}
// @lc code=end

