package p704;

public class BinarySearch {
    static public int search(int[] nums, int target) {
        for(int i=0;i<nums.length ;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},9));
    }
}
