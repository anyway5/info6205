package MidTerm;

public class Solution3 {
    public int getMaxConsecutiveOnes(int[] nums){
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
                if (count > max) {
                    max = count;
                }
            }else{
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,0,1,1,0,1,1,1,0,0,0};
        Solution3 s3 = new Solution3();
        int max = s3.getMaxConsecutiveOnes(arr);
        System.out.println(max);
    }
}
