public class SolutionQ11 {
    public int maxArea(int[] height) {
        int n = height.length;
        int result = 0;
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++){
               int tem = (j-i)*(Math.min(height[i],height[j]));
               result = Math.max(tem,result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        SolutionQ11 solutionQ11 = new SolutionQ11();
        System.out.println(solutionQ11.maxArea(height));
    }
}
