class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ""
        prifix=strs[0]
        for s in strs[1:]:
            while not s.startswith(prifix):
                prifix=prifix[:-1]
                if not prifix:
                    return ""
        return prifix
        