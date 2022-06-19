public class SolutionQ4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int sumSize = size1+size2;
        int medianIndex = 0;
        boolean single = true;
        if (sumSize%2==0){
            medianIndex = sumSize/2-1;
            single = false;
        }
        else{
            medianIndex = sumSize/2;
        }
        int index1 = 0;
        int index2 = 0;
        int[] result = new int[medianIndex+2];
        while (index1<=size1-1 && index2<=size2-1){
            if (nums1[index1]<nums2[index2]){
                result[index1+index2] = nums1[index1];
                index1++;
            }
            else {
                result[index1+index2] = nums2[index2];
                index2++;
            }
            if (single){
                if (index1+index2==medianIndex+1){
                    return result[medianIndex];
                }
            }
            else {
                if (index1+index2==medianIndex+2){
                    return (double)(result[medianIndex]+result[medianIndex+1])/2;
                }
            }
        }


        if (single){
            if (index1==size1){
                while (index1+index2<medianIndex+1){
                    result[index1+index2] = nums2[index2];
                    index2++;
                }
            }
            else {
                while (index1+index2<medianIndex+1){
                    result[index1+index2] = nums1[index1];
                    index1++;
                }
            }
                return result[medianIndex];
        }
        else {
            if (index1==size1){
                while (index1+index2<medianIndex+2){
                    result[index1+index2] = nums2[index2];
                    index2++;
                }
            }
            else {
                while (index1+index2<medianIndex+2){
                    result[index1+index2] = nums1[index1];
                    index1++;
                }
            }
                return (double) (result[medianIndex]+result[medianIndex+1])/2;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,4};
        int[] nums2 = new int[]{};
        SolutionQ4 solutionQ4 = new SolutionQ4();
        System.out.println(solutionQ4.findMedianSortedArrays(nums1,nums2));
    }
}
