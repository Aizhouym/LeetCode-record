package quize;

import java.util.ArrayList;

public class Elimination {
    public static void main(String[] args) {
        Elimination elimination = new Elimination();
        elimination.solution(23);
    }
    public void solution(int n){
        ArrayList<Integer> arrayList = new ArrayList<>();//初始化list
        for (int i = 0; i < n; i++){
            arrayList.add(i+1);
        }

        boolean isleft = true; //判断应该执行那一边。

        while(arrayList.size() > 2){

            if(isleft){
                ArrayList<Integer> leftTmp = new ArrayList<>();

                for(int i = 0; i < arrayList.size(); i = i + 2){
                        leftTmp.add(arrayList.get(i));
                        
                }
                arrayList.removeAll(leftTmp); //去除左边的数组
                isleft = false;
            }else{

                ArrayList<Integer> rightTmp = new ArrayList<>();
                for(int j = arrayList.size()-1; j >= 0; j = j - 2){
                    rightTmp.add(arrayList.get(j)); 
                }
                arrayList.removeAll(rightTmp);//去除右边的数组
                isleft = true;
            }
        }
        if(isleft){
            System.out.println(arrayList.get(1));
        }else{
            System.out.println(arrayList.get(0));
        }
    }
}
