class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        i,j=0,0
        arr=[]
        while i<len(nums1) and j<len(nums2):
            if nums1[i]<nums2[j]:
                arr.append(nums1[i])
                i=i+1
            else:
               arr.append(nums2[j])
               j=j+1
           
        while i<len(nums1):
           arr.append(nums1[i])
           i=i+1
        while j<len(nums2):
            arr.append(nums2[j])
            j=j+1
        n=len(arr)
        if n%2==0:
            k=n//2
            return (arr[k-1]+arr[k])/2.0
        else:
            return arr[n//2]

        