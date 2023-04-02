package p540;

public class SingleElementinaSortedArray {
    static public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }else{
            for(int i=0;i<nums.length-1;i+=2){

                if(nums[i]!=nums[i+1]){
                    return nums[i];
                }
            }

        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2,2,3,3,6,7,7}));
    }
}
