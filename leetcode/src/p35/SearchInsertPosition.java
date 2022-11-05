package p35;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>target){
                return i;
            }
        }



        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1,3,5,6},7));;
    }
}
