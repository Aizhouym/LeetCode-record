
public class Solution {

    public int getIndex(int[] num, int target){
        int low, high, mid;
        low = 0;
        high = num.length-1;
    
        while(low<=high){
            mid = (low+high)/2;
            if( target < num[mid] ){
                high = mid - 1;
            }else if( target == num[mid] ){
                return mid;
            }else if( target > num[mid] ){
                low = mid+1;
            }
        }//Binary Search
        
        return -1;
        
    }

}



