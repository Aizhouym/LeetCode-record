
public class Solution{
    public void moveZeros(int[] nums){
        int length = nums.length;
        int slowPoint = 0;
        int countZero = 0;
        
        for(int fastPoint=0; fastPoint<length; fastPoint++){
            if(nums[fastPoint] != 0 ){
                nums[slowPoint] = nums[fastPoint];
                slowPoint++;
            }else{
                countZero++;
            }
        }//通过快慢指针完成覆盖

        for(int i=length-countZero; i<length; i++){
            nums[i] = 0;
        }//将后续的值覆盖为0；

    }
}