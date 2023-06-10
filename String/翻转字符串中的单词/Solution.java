
class Solution {
    public String reverseWords(String s) {
        String x = s.trim(); //注意String中的 trim方法，去除头尾的空格
        String[] list = x.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = list.length - 1; i>=0; i--){
            String tmp = list[i];
            if(tmp.length() == 0){
               continue; 
            }
            sb.append(tmp);
            if(i>0){
               sb.append(" ");
            }
        }

        String output = sb.toString();
        return output;
    }
}