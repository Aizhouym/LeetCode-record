class Solution:
    def moveZero(self, num:list[int]):
        slow = 0
        for fast in range(len(num)):
            if num[fast] == 0:
                continue
            else:
                num[slow] = num[fast]
                slow = slow + 1
    
    