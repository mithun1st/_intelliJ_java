package p27;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] expectedNums=nums;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                k++;
            }
        }
        int l=0;
        for(int i=0;i<expectedNums.length;i++){
            if(expectedNums[i]!=val){
                nums[l]=expectedNums[i];
                l++;
            }
        }

        System.out.println(k);
        for(int i : nums){
            System.out.print(i+" ");
        }
        return k;
    }
//    Input: nums = [0,1,2,2,3,0,4,2], val = 2
//    Output: 5, nums = [0,1,4,0,3,_,_,_]
    public static void main(String[] args) {
        new RemoveElement().removeElement(new int[]{0,1,2,2,3,0,4,2},2);
    }
}
