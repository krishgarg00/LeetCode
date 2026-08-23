class Solution {
    public int firstMissingPositive(int[] nums) {
        int small=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==small){
                small++;
            }
            else if(nums[i]>small){
                return small;
            }
        }
        return small;
    }
}