class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }        
        int j=1;
        for(int i : set){
            if(!set.contains(j*k)){
                return j*k;
            }
            else{
                j++;
            }
        }
        return j*k;
    }
}