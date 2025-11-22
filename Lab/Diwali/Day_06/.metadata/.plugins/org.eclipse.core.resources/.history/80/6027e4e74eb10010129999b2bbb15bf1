public class MergeSortedArrays {
    
    public static int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m + n];
        
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        
        // Copy remaining elements
        if (i < m) {
            System.arraycopy(nums1, i, result, k, m - i);
        }
        if (j < n) {
            System.arraycopy(nums2, j, result, k, n - j);
        }
        
        return result;
    }
}