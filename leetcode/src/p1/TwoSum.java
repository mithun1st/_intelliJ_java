package p1;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int x=0,y=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    x=i;
                    y=j;
                }
            }
        }
        return new int[]{x,y};
    }

    public static void main (String[] args){
        int[] n= new TwoSum().twoSum(new int[]{3,3},6);


        for (int i : n){
            System.out.println(i);
        }
    }
}