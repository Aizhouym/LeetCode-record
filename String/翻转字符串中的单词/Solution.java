
public class Solution {
    // public String reverseString(String s){

    // }   
    
    public static void main(String[] args) {
        // Solution solution = new Solution();
        String s = "the blue sky";
        String[] list = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = list.length - 1; i>=0; i--){
            String tmp = list[i];
            if(tmp.equals(" ")){
               continue; 
            }
            sb.append(tmp);
            if(i>0){
               sb.append(" ");
            }
        }

        StringBuilder sBuilder = new StringBuilder(s);
        System.out.println(sBuilder.reverse().toString());

        String output = sb.toString();
        System.out.println(output);
    }
}
