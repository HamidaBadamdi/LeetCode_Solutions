'''
LeetCode Problem: 35. Search Insert Position
Difficulty: Easy

Approach:
- Traverse the list from left to right.
- If current element is greater than or equal to target,
  return its index.
- If target is not found and is greater than all elements,
  return the length of the list.

Time Complexity: O(n)
Space Complexity: O(1)

Author: Hamida Badamdi

'''

class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        
        for i in range(len(nums)):

            if nums[i] >= target:
                return i
        return len(nums)
