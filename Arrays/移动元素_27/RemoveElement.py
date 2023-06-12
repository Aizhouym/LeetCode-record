class Solution:
    def moveElement(self, nums:list(int), target:int) -> int:
        slow = 0
        fast = 0
        size = len(nums)
        count = 0

        while fast < size:
            if nums[fast] != target:
                nums[slow] = nums[fast]
                slow += 1
            else:
                count +=1
            fast +=1
        
        for i in range(count):
            nums[size-1-i] = 0

        return slow
        