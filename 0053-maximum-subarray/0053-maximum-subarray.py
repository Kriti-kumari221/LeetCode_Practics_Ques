class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_currect=max_globle=nums[0]
        for i in range(1,len(nums)):
            max_currect=max(nums[i],nums[i]+max_currect)
            if(max_currect>max_globle):
                max_globle=max_currect
        return max_globle