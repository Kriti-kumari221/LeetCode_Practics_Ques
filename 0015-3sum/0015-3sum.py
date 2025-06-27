class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        result=set()
        for i in range(len(nums)):
            seen=set()
            for j in range(i+1,len(nums)):
                complement=-(nums[i]+nums[j])
                if(complement in seen):
                    result.add(tuple(sorted((nums[i], nums[j], complement))))
                seen.add(nums[j])
        return [list(triplet)for triplet in result]
                    

        
        