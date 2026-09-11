class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq = new int[26];
        int left =0;
        int maxfreq=0;
        int maxWindow=0;
        for(int ryt=0;ryt<s.length();ryt++){
            freq[s.charAt(ryt)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(ryt)-'A']);
            int len = ryt-left+1;
            if(len-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            len =ryt-left+1;
            maxWindow =Math.max(maxWindow,len);
        }
        return maxWindow;
        
    }
}