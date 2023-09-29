package org.example;

import java.util.Arrays;

public class App {
    public App() {
    }

    /**
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
     * <p>
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * <p>
     * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     */
    public void merge(int m, int n, int[] nums1, int[] nums2) {
        int[] result = new int[m + n];
        int firstArrayCounter = 0;
        int secondArrayCounter = 0;
        int resultCounter = 0;
        while (firstArrayCounter < m && secondArrayCounter < n) {
            if (nums1[firstArrayCounter] < nums2[secondArrayCounter]) {
                result[resultCounter] = nums1[firstArrayCounter];
                firstArrayCounter++;
            } else {
                result[resultCounter] = nums2[secondArrayCounter];
                secondArrayCounter++;
            }
            resultCounter++;
        }
        while (firstArrayCounter < m) {
            result[resultCounter] = nums1[firstArrayCounter];
            firstArrayCounter++;
        }
        while (secondArrayCounter < n) {
            result[resultCounter] = nums2[secondArrayCounter];
            secondArrayCounter++;
        }

        System.out.println("nums1 = " + Arrays.toString(nums1) + "\nnums2 = " + Arrays.toString(nums2));
        nums1 = result;
        System.out.println("Result : " + Arrays.toString(nums1));
    }
}
