package Arrays.RemoveElement_27;

public class Solution{
    public int removeElement(int[] nums, int val){
        int length = nums.length;
        int lowPoint = 0;

        for(int fastPoint=0; fastPoint<length; fastPoint++){
            if(nums[fastPoint] != val){
                nums[lowPoint] = nums[fastPoint];
                lowPoint++;
            }
        }
        
        return  lowPoint;
    }

}