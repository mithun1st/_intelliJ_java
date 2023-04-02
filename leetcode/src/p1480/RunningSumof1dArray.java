package p1480;

import java.util.ArrayList;
import java.util.HashMap;

public class RunningSumof1dArray {

    static public int[] runningSum(int[] nums) {
        int[] result=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            result[i]=sum;
        }
        return result;
    }

    public static void main(String[] args) {
        /*
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
         */

        for ( int i : runningSum(new int[]{1,2,3,4})){
            System.out.print(i + " ");
        }


    }
}
