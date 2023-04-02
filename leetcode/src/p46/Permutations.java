package p46;

import java.util.*;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList(0);

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if(!list.contains(new ArrayList<Integer>(
                            Arrays.asList(nums[i],nums[j],nums[k])
                    ))&& i!=j && j!=k && k!=i){
                        list.add(new ArrayList<Integer>(
                                Arrays.asList(nums[i],nums[j],nums[k])
                        ));
                    }

                }
            }
        }
        for(List l : list){
            System.out.println(l);
        }
        return list;
    }

    public static void main(String[] args){
        new Permutations().permute(new int[]{1,2,3});

    }
}
