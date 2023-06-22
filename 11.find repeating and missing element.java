public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        
        long n=A.length;
        long sn=(n*(n+1))/2;
        long s2n=(n*(n+1)*(2*n+1))/6;
        long s=0,s2=0;
        for(int i=0;i<n;i++){
            s+=A[i];
            s2+=(long)A[i]*(long)A[i];
        }
        long val1=s-sn;
        long val2=s2-s2n;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        int [] ans={(int)x,(int)y};
        return ans;
    }
}
