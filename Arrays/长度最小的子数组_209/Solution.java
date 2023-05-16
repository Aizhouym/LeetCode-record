package Arrays.长度最小的子数组_209 ;

public class Solution{
    public int minSubArrayLen_straight(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;//定义子串之和
        int sublen = 0;//定义子串长度
        
        for(int i=0; i<nums.length; i++){
            sum = 0;
            for(int j=i; j<nums.length; j++){
                sum+= nums[j];
                if(sum >= target){
                    sublen = j - i + 1;
                    result = result < sublen ? result : sublen;
                    break; 
                }
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }//暴力解法，通过两个for循环来寻找数组中的最小子序列


    public int minSubArrayLen(int target, int[] nums){
        int result = Integer.MAX_VALUE;//init 
        int sum = 0;
        int sublen = 0;
        int i = 0;//定义活动窗口的其实位置

        for(int j=0; j<nums.length; j++){
            sum += nums[j];
            while(sum >= target){
                sublen = j - i + 1;
                result = result < sublen ? result : sublen;
                result -= nums[i++];
            }
        }

        return  result == Integer.MAX_VALUE ? 0 : result;
    }//使用滑动窗口

}