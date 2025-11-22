import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            merged[k++] = nums1[i++];
        }
        while (j < n2) {
            merged[k++] = nums2[j++];
        }

        System.out.println("Merged sorted array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
