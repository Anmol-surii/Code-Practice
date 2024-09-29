public class FindMiddleIndexinArray {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        for(int x : nums) {
            totalSum += x;
        }
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}