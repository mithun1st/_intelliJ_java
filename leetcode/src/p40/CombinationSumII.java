package p40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public static List<Object> rev( List<Object> l ){
        return l;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<candidates.length;i++){
            for(int j=i;j<candidates.length;j++){
                if(candidates[i]<candidates[j]){
                    int t=candidates[i];
                    candidates[i]=candidates[j];
                    candidates[j]=t;
                }
            }
        }
        for(int t : candidates){
            System.out.print(" "+t);
        }
        System.out.println();
        for(int i=0;i<candidates.length-1;i++){
            int tem=0;
            List<Integer> l = new ArrayList<>();
            for(int j=i;j<candidates.length;j++){
                if(candidates[j]>target){
                    continue;
                }
                tem+=candidates[j];
                if(tem<=target){
                    l.add(candidates[j]);
                }else{
                    tem=tem-candidates[j];
                }
            }
//            System.out.println(tem);
            if(tem==target){

                list.add(l);
            }
//            System.out.println(l);
//            System.out.println();
        }
        for(int i=0,j=list.size()-1;i<list.size()/2;i++,j--){
            List<Integer> t=list.get(i);
            list.set(i, list.get(j));
            list.set(j,t);
        }
        System.out.println(list);
        return new ArrayList<>(0);
    }

    public static void main(String[] args) {
        new CombinationSumII().combinationSum(new int[]{10,1,2,7,6,1,5},8);
    }
}
