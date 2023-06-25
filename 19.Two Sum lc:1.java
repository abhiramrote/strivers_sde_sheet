class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j=1;
        int n=nums.length;
        Map<Integer,Integer> k=new HashMap<>();
        int []res=new int[2];
        for(i=0;i<n;i++){
            if(k.containsKey(target-nums[i])){
                    res[1]=i;
                    res[0]=k.get(target-nums[i]);
                    //return res;
            }
            k.put(nums[i],i);
        }
        return res;
    }
}
