class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int mid = nums[nums.length/2];
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==mid){
                cnt++;
            }
        }
        return cnt==1;
    }
}