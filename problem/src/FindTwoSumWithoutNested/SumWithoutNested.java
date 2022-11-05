package FindTwoSumWithoutNested;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SumWithoutNested {
/*
There is a 'List or array' and 'sum number' given by the examinar and we have to find whether two item's sum
of that particular List is equal to sum or not.

Sum is 20.

[1, 6, 4, 4, 5, 16, 12, 4] , sum = 20 ===> return true


[1, 6, 4, 4, 5, 12, 12, 4] , sum = 20 ===> return false

Avoid nested for loops for this problem. It is the main agenda for now.
 */
    public static Boolean fnc(int[] nums, int n){
        for(int i=0, j=i+1;i<nums.length-1;j++){
            if(nums[i]+nums[j]==n){
                return true;
            }
            if(j==nums.length-1){
                j=i+1;
                i++;
            }
        }
        return false;
    }

    public static Boolean fnc1(int[] nums, int n){
        ArrayList<Integer> list=new ArrayList<>();

        for(int i: nums){
            if(list.contains(n-i)){
                //System.out.println(i);
                //System.out.println(n-i);
                return true;
            }
            list.add(i);
        }
        //System.out.println(list);
        return false;
    }

    public static void main(String[] args) {
        //System.out.println(fnc(new int[]{1, 6, 4, 4, 5, 16, 12, 4}, 20));
        System.out.println(fnc1(new int[]{1, 6, 4, 4, 5, 16, 12, 4}, 20));
    }

}
