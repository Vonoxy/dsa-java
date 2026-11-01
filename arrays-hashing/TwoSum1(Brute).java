class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int j=0;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                if((target-nums[j])==nums[k] && j!=k){
                    return new int[]{j,k};
                }
            }
        }
        return new int[]{};
    }
}
