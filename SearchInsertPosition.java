/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int m=(l+h)/2;
        int res=0;
        while(l<=h)
        {
             m=(l+h)/2;
            if(nums[m]==target)
            {
                res=m;
                break;
            }
        
            if(nums[m]<target)
            {
                l=m+1;
                res=l;

            }
             else if(nums[m]>target)
            {
                h=m-1;
                res=m;
            }
        }
            return res;
    }
}
