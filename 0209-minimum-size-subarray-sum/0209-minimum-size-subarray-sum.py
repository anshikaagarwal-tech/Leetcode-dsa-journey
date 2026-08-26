class Solution(object):
    def minSubArrayLen(self, target, nums):
        sum= 0
        low=0
        high=0
        n=len(nums)
        res=float('inf')
        while high <n:
            sum=sum+nums[high]
            while(sum>=target):
                length=high-low+1
                res=min(res,length)
                sum=sum-nums[low]
                low+=1
            high+=1
        if res == float('inf'):
            return 0
        return res
        