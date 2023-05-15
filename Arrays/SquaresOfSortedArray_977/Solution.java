
public class Solution {
        public int[] sortedSquares(int[] nums){
            //暴力解法
            int length = nums.length;
            
            for(int i=0; i<length; i++){
                nums[i] = nums[i]*nums[i];
            }

            for(int j=0; j<length-1; j++){
                for(int k=j+1; k<length; k++){
                    if(nums[j] > nums[k]){
                        int temp = nums[k];
                        nums[k] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
            
            return  nums;
        }
        
        public int[] sortedSquares2(int[] nums){
            //双指针实现
            int left = 0;
            int right = nums.length-1;
            int[] result = new int[nums.length];
            int index = nums.length-1;

            while(left <= right){
                if( (nums[left]*nums[left]) < (nums[right]*nums[right]) ){
                    result[index--] = nums[right]*nums[right];
                    right--; //--right;
                }else{
                    result[index--] = nums[left]*nums[left];
                    left++; //++left;
                }

            }

            return result;
        }

}
