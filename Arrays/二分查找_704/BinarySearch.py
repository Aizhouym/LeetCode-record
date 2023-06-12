class Solution:
    def binarySearch(self, num:list[int], target:int) -> int :
        left = 0
        right = len(num) - 1

        while left <= right:
            mid = left + (right - left)//2

            if (target > num[mid]):
                mid = (left + right) /2
            elif(target == num[mid]):
                return mid
            else:
                mid = (left + right)/2
        
        return -1