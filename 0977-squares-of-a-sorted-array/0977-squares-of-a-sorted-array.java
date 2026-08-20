import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] result= new int [nums.length];
        int head=0;
        int tail = nums.length-1;
        for(int pos =nums.length-1;pos>=0;pos--){
            int leftSquare = nums[head]*nums[head];
            int rightSquare = nums[tail]*nums[tail];
            if (leftSquare > rightSquare){
                result[pos]=leftSquare;
                head++;
            }else{
                result[pos]=rightSquare;
                tail--;
            }
        }
        return result;
        }

    }
