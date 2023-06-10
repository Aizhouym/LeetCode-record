package quize;

public class traver {
    public static void main(String[] args) {
        traver x = new traver();
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        x.solution(mat);


    }


    public int[] solution(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        
        int[] res = {1,2,4,7,5,3,6,8,9};
        return res;
        
         
    }
}
