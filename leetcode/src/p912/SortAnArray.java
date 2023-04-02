package p912;

public class SortAnArray {
    static public int[] sortArray(int[] nums) {

        for(int i =0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                int tem=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=tem;
                i=-1;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        for(int i : sortArray(new int []{7,9,2,3,4,1,6})){
            System.out.print(i+" ");
            }
    }
}

