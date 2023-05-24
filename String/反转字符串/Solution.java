
public class Solution {
    public void reverseString(char[]  s){
        int length = s.length;
        int left = 0;
        int right = length - 1;
        while (left < right){
            char tmp = s[left];
            s[left] = s[right];
            s[left] = tmp;
            left++;
            right--;
        }
        
    }
}
