import java.util.ArrayList;
import java.util.Arrays;

public class SolutionQ1 {
    //第一遍思路 列表排序+二分查找
    public int[] twoSum(int[] nums, int target) {
        int[] old = nums.clone();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++) {
            int tem = target - nums[i];
            int secIndex = binarySearch(nums, tem, i+1,nums.length-1);
            if (secIndex != -1) {
                return checkIndex(old, nums[i], nums[secIndex]);
            }
        }
        return null;
    }

    public int[] checkIndex(int[] nums,int num1,int num2){
        int[] result = new int[]{-1,-1};
        for (int i=0;i<nums.length;i++){
            if (nums[i]==num1 && result[0]==-1){
                result[0] = i;
            }
            else if (nums[i]==num2){
                result[1] = i;
            }
        }
        return result;
    }

    public int binarySearch(int[] nums,int temTarget,int low,int high){
        if (low>high || nums[low]>temTarget || nums[high]<temTarget){
            return -1;
        }
        if (nums[(high-low)/2+low]>temTarget){
            return binarySearch(nums,temTarget,low,(high-low)/2+low-1);
        }
        else if (nums[(high-low)/2+low]<temTarget){
            return binarySearch(nums,temTarget,(high-low)/2+low+1,high);
        }
        else {
            return (high-low)/2+low;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-2,-3,-4,-5};
        int target = -8;
        SolutionQ1 solutionQ1 = new SolutionQ1();
        int[] result = solutionQ1.twoSum(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
