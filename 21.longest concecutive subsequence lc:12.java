class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> hs=new HashSet<>() ;
       for(int num:nums){
           hs.add(num);
       }
       int longestStreak=0;
       for(int num:nums){
           if(!hs.contains(num-1)){
               int cnum=num;
               int cstreak=1;
           
           while(hs.contains(cnum+1)){
               cnum+=1;
               cstreak+=1;
             }
           
           longestStreak=Math.max(longestStreak,cstreak);
       }
       }
        return longestStreak;
    }
}
