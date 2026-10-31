import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> save = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(save.contains(nums[i])){
                return true;
            }
            else{
                save.add(nums[i]);
            }
        }
        return false;
    }
}
