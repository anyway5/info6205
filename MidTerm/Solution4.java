package MidTerm;

public class Solution4 {
    public int getIndex(int[] nums, int x){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] >= x){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == x) idx = mid;
        }
        return idx;
    }

    public static void main(String[] args) {
        int [] arr = {2,4,4,4,6,7,7,7,8,9,9,9};
        Solution4 s4 = new Solution4();
        int index = s4.getIndex(arr,7);
        System.out.println(index);
    }
}
