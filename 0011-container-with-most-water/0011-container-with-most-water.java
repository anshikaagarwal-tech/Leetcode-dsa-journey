class Solution {
    public int maxArea(int[] height) {
        int lp=0; 
        int rp =height.length-1;
        int width=0;
        int currwt=0;int maxwt=0;
        while(lp<rp){
            width=rp-lp;
            int h =Math.min(height[rp],height[lp]);
            currwt=width*h;
            maxwt=Math.max(maxwt,currwt);
        
        if(height[rp]>height[lp]){
            lp++;
        }
        else{
            rp--;
        }
        }
        return maxwt;

        
    }
}