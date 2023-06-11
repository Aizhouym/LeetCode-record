
public class Solution {
    public String reverseLeftWords(String s, int n){
        //不考虑使用java内置函数库，通过使用空间复杂度为O(1)来实现对字符串的反转。
        StringBuilder sb = new StringBuilder(s);
        int start1 = 0;
        int end1 = n - 1;
        int start2 = n;
        int end2 = s.length() - 1;
        swaep(sb, start1, end1);
        swaep(sb, start2, end2);
        
        return sb.reverse().toString();
    }


    public void swaep(StringBuilder sb, int start, int end){
        while(start < end){
            char tmp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, tmp);
            start++;
            end--;
        }
    }

}
