import java.util.ArrayList;
import java.util.List;

public class Solution{
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        //定义返回值
        int i,j;
        int loop = 0;
        int start = 0;
        int m = matrix.length; // 行数
        int n = matrix[0].length; //列数
        int times = Math.min(m, n);

        while (loop++ < times/2){

            for (j = start; j < n - loop; j++){
                int temp = matrix[start][j];
                result.add(temp);
            }// for循环获取上面 从左到右

            for (i = start; i < m - loop; i++){
                int temp = matrix[i][j];
                result.add(temp);
            }// for循环获取右边 从上到下

            for(j = n - loop - 1; j >= loop; j--){
                int temp = matrix[i][j];
                result.add(temp);
            }// for循环获取下边 从右到左

            for(i = m - loop - 1; i >= loop; i--){
                int temp = matrix[i][j];
                result.add(temp);
            }// for循环获取左边 从下到上
            
            start++;
        }
        
        if (m == n){
            if (m % 2 != 0){
                result.add(matrix[start][start]);
            }
        }else{
            if (times % 2 != 0){
                if (m == times){
                    for (int k = start; k < n-start; k++){
                        int temp = matrix[start][k];
                        result.add(temp);
                    }
                }else{
                    for (int l = start; l < m-start; l++){
                        int temp = matrix[l][start];
                        result.add(temp);
                    }
                }
            }
        }

        return result; 
    }
}

