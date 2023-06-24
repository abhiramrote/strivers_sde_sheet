class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int N = nums.length;       
        int count1 = 0,count2 = 0, cand1 = -1, cand2 =-1;
        for(int i : nums){          
            if(cand1 == i){
                count1++;
            }else if(cand2 == i){
                count2++;
            }else if(count1 == 0){
                cand1 = i;
                count1 = 1;
            }else if(count2 == 0){
                cand2 = i;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
         }
        count1 = count2 = 0;  
        for(int i : nums){
            if(cand1 == i)count1++;
            if(cand2 == i)count2++;
        }
          if(count1 > N/3){
            ans.add(cand1);
        }
        if(count2 > N/3){
            ans.add(cand2);
        }
          return ans;  
    }
}
