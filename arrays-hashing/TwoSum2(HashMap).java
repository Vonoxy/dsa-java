class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> partner=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sols=target-nums[i];
            if(partner.containsKey(sols)){
                int pos=partner.get(sols);
                return new int[]{pos,i};
            }
            partner.put(nums[i],i);
        }
        return new int[]{};
    }
}
