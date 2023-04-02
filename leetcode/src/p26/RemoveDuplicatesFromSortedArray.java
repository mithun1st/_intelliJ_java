package p26;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i = 0; i< nums.length; i++){
            if(nums[k]!= nums[i]){
                k++;
                nums[k]= nums[i];
            }
        }
        k++;

        System.out.println(k);
        for(int i: nums){
            System.out.print(i+" ");
        }

        return k;
    }
//    Input: nums = [0,0,1,1,1,2,2,3,3,4]
//    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
