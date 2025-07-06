//135ms 74.00mb

import java.util.*;

class FindSumPairs {
    int a1[], a2[];
    HashMap<Integer, Integer> hm;

    public FindSumPairs(int[] nums1, int[] nums2) {
        a1 = nums1;
        a2 = nums2;
        hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < a2.length; i++) {
            hm.put(a2[i], hm.getOrDefault(a2[i], 0) + 1);
        }
    }

    public void add(int index, int val) {
        int updated = a2[index] + val;
        hm.put(a2[index], hm.get(a2[index]) - 1);
        hm.put(updated, hm.getOrDefault(updated, 0) + 1);
        a2[index] = updated;
    }

    public int count(int tot) {
        int count = 0;
        int comp = 0;
        for (int i = 0; i < a1.length; i++) {
            comp = tot - a1[i];
            count += hm.getOrDefault(comp, 0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */