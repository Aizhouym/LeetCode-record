import java.util.Scanner;

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


    public static void main(String[] args) {
    
        Solution solution = new Solution();
        int[] num ={1,4,9,10,17,25,29,35,40,45,48,75};
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入target:");
        int target = sc.nextInt();
        System.out.println(solution.getIndex(num, target));
        sc.close();
    
    }
}



