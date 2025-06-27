class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        fun={}
        for i, count in enumerate(nums):
            sumn=target-nums[i]
            if sumn in fun:
                return [fun[sumn],i]
            fun[count]=i;
        return []
        
        