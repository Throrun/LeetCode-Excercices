package org.example;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        int[] nums2;
        nums2 = new int[]{1, 2, 3, 4, 55, 222};
        int[] nums1;
        nums1 = new int[]{1, 2, 32, 322242};
        app.merge(nums1.length,nums2.length,nums1,nums2);
        System.out.println("Hello world!");
    }
}