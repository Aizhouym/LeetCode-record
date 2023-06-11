

public class Solution{
    public String replaceSpace(String s){
        
        if (s == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i< s.length(); i++){
            if ("".equals(String.valueOf(s.charAt(i)))){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
