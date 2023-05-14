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
        
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println("请输入数组长度：");
        int length = sc.nextInt();
        int[] num = new int[length];
        for(int i = 0; i<length; i++){
            num[i] = sc.nextInt();
        }
        System.out.print("请输入target:");
        int target = sc.nextInt();
        System.out.println(solution.getIndex(num, target));
        sc.close();
    
    }
}



