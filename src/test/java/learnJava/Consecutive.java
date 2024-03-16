package learnJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Consecutive {
	
	public int Consecutive (int[] nums) {
		
	
	Set<Integer> set=new HashSet<>();
	for(int n : nums)
		set.add(n);
	
	int max=0;
	for(int i=0;i< nums.length;i++)
	{
		int num=nums[i];
		if (set.contains(num - 1)) continue;
		
		int currlen=0;
		while(set.contains(num))
		{
			
			currlen+=1;
			num+=1;
		}
		max=Math.max(max, currlen);
	}
	return max;
		
	
	}
}
