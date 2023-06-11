

public class Solution {
    public String reverseStr(String s, int k){
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i+=2*k){
            int start = i;
            int end = Math.min(ch.length - 1, start + k -1);

            while (start < end){
                char tmp = ch[start];
                ch[start] = ch[end];
                ch[end] = tmp;
                start++;
                end--;
            }
        }

        return new String(ch);
    }
}
