public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == target)
                return new int[]{i,j};
            }
        }
        return new int[0];
    }
    
    public static void main(String[] args){
        int[] nums= {5,4,3,7,2};
        int target = 12;
        int[] result = twoSum(nums,target);
        System.out.println(result);
    }
}
