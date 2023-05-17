
public class Solution{
    public int[][] generateMatrix(int n){
        int loop = 0;
        int start = 0;
        int count = 1;
        int i,j;//全局变量不变，从而能保证循环赋值
        int[][] result = new int[n][n];

        while (loop++ < n/2 ){

            for (j = start; j < n - loop; j++){
                result[start][j] = count++;
            }//上边 从左到右

            for (i = start; i < n - loop; i++){
                result[i][j] = count++;
            }//右边 从上到下
            
            for (; j >= loop; j--){
                result[i][j] = count++;
            }//下边 从右向左
            
            for(; i >= loop; i--){
                result[i][j] = count++;
            }//左边 从下到上

            start++;
        }

        if (n%2 == 1){
            result[start][start] = count;
        }//如果是奇数，进行中间位置赋值

        return result;
    }
}