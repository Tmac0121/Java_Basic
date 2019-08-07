class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i=0;i<=nums.length-1;i++){
            for(int j=0;j<=nums.length-1;j++){
                // if (nums[i]>target|nums[j]>target){
                //     continue;
                // }
                if (nums[i]+nums[j]==target){
                    ans[1]=nums[i];
                    ans[0]=nums[j];
                    // break;
                }
            }
        }
        return ans;
    }

    // String toString(){
    //     return ;
    // }

    public static void main(String[] args){
        int nums[] ={2,7,11,15,17,3,4,43,19,12,20,9,7,6,5};
        System.out.println(twoSum(nums,21)[0]);
        System.out.println(twoSum(nums,21)[1]);
    }
}