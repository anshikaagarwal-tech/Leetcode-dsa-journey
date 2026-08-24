class Solution {
    public boolean sumGame(String num) {

        int n = num.length();
        int half = n / 2;

        int leftSum = 0;
        int rightSum = 0;
        int leftQ = 0;
        int rightQ = 0;

        // Count sums and '?' in both halves
        for (int i = 0; i < half; i++) {
            if (num.charAt(i) == '?')
                leftQ++;
            else
                leftSum += num.charAt(i) - '0';
        }

        for (int i = half; i < n; i++) {
            if (num.charAt(i) == '?')
                rightQ++;
            else
                rightSum += num.charAt(i) - '0';
        }

        // If number of ? is odd, Alice always wins
        if ((leftQ + rightQ) % 2 == 1)
            return true;

        // Difference between existing sums
        int diff = leftSum - rightSum;

        // Difference in number of ? between halves
        int qDiff = leftQ - rightQ;

        
        return diff != -(qDiff * 9) / 2;
    }
}