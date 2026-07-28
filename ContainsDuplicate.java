package placement_prep;

import java.util.HashSet;

public class ContainsDuplicate {

	//Approach 1: Brute Force -  TC : O(n) square
	
	public static boolean containsDuplicate(int nums[])
	{
		for(int i=0; i<nums.length; i++)
		{
			for(int j=i+1; j<nums.length; j++)
			{
				if(nums[i] == nums[j])
				{
					return true;
				}
			}
		}
		return false;
	}
	
	//Approach 2: Optimal - Using HashSet  - TC: O(n)
	
	public static boolean isDuplicate(int[] nums)
	{
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : nums)
		{
			if(set.contains(num))
			{
				return true;
			}
			
			set.add(num);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int nums[]  = {1 , 2, 3, 1 ,4};
		//System.out.println(containsDuplicate(nums));
		System.out.println(isDuplicate(nums));

	}

}
