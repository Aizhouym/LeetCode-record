package quize;

public class Replace {
    public static void main(String[] args) {

        Replace replace = new Replace();
        replace.solution(7);
    
    }

    public void solution(int n){
        int count = 0; //设置计数器
        while(n > 1){
            if(n % 2 == 0){
                n = n/2;
                count++;
            }else{
                int times = getLog2(n);
                int compare1 =(int) Math.pow(2, times);
                int compare2 = (int) Math.pow(2, times+1);
                if( Math.abs( n - compare1 ) < Math.abs( n - compare2 ) ){
                    n = n - 1;
                }else{
                    n = n + 1;
                }
                count++;
            }
        }
        System.out.println(count);
    }
    public int getLog2(int n){
        int count = 0;
        while( n >= 2){
            n = n/2;
            count++;
        }
        return count;
    }

}
