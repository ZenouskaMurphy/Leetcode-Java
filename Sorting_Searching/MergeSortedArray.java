/* COMPLETED 
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]

*/

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /* in place approach*/
        // iterate from right to left
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (k >= 0) {
            //if nums1[i] > nums2[i]
            // place last element of nums1 at end of nums1 array
            if (j < 0 || (i >= 0 && nums1[i] > nums2[j])){
                nums1[k--] = nums1[i--];
            }
            else{
            //if(nums2[i] > nums1[i]
            // place last element of nums2 at end of nums1 array
                nums1[k--] = nums2[j--];
            }
         }
    }
}
