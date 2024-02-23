/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayproblems;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 *
 * @author Alondra Bio
 */
public class ArrayProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(Arrays.toString(uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        LinkedHashSet<String> unique = new LinkedHashSet<>();
        for (int i = 0; i < names1.length; i++){
            unique.add(names1[i]);
            unique.add(names2[i]);
        }
        
        String[] uniqueNames = new String[unique.size()];
        int index = 0;
        for (String name : unique) {
            uniqueNames[index++] = name;
        }
        return uniqueNames;
    }
    
    /*
     * MERGE ARRAYS
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * You are given two integer arrays nums1 and nums2, 
     * sorted in non-decreasing order, and two integers m and n, 
     * representing the number of elements in nums1 and nums2 respectively.
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy elements from nums2 to nums1
        System.arraycopy(nums2, 0, nums1, m, n);

        // Sort the merged array
        Arrays.sort(nums1);
    }
    
    /*
     * REMOVE ELEMENT
     * Given an integer array nums and an integer val, 
     * remove all occurrences of val in nums in-place. 
     * The order of the elements may be changed. 
     * Then return the number of elements in nums which are not equal to val.
     */
    public static int removeElement(int[] nums, int val) {
        int k = nums.length; //number of val in the array

        int left = 0;
        int right = k-1;

        //Swap the elements
        while(left <= right){
            if(nums[left] == val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
                k--;
            } else {
                left++;
            }
        }

        return k;
    }
    
    /*
     * REMOVE DUPLICATES IN AN ARRAY 1
     * Given an integer array nums sorted in non-decreasing order, 
     * remove the duplicates in-place such that each unique element appears only once. 
     * The relative order of the elements should be kept the same. 
     * Then return the number of unique elements in nums.
     */
    public static int removeDuplicates1(int[] nums) {
        int j=1;
        for (int i=1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j; //returns the first k non duplicates
    }
    
    /*
     * REMOVE DUPLICATES IN AN ARRAY 2
     * Given an integer array nums sorted in non-decreasing order, 
     * remove some duplicates in-place such that each unique element appears at most twice.
     * The relative order of the elements should be kept the same.
     */
    public static int removeDuplicates2(int[] nums) {    
    int j = 2; // Starting index for the result array

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
    
    /*
     * PRODUCT OF ARRAY EXCEPT ITSELF
     * Given an integer array nums, 
     * return an array answer such that answer[i] 
     * is equal to the product of all the elements of nums except nums[i].
     */
    public static int[] productExceptSelf1(int[] nums) {
        int length = nums.length;
        int[] arrayCopy = Arrays.copyOf(nums, nums.length);
        //System.arraycopy(nums, 0, arrayCopy, 0, length); same with this syntax
        System.out.println(Arrays.toString(arrayCopy));
        
        for (int i = 0; i < length; i++) {
            int product = 1;
            for (int j = 0; j < length; j++) {
                if(i==j){
                    continue;
                }
                product *= arrayCopy[j];
            }
            nums[i] = product;
        }
        return nums;
    }
    
    public static int[] productExceptSelf2(int[] nums) {
        int length = nums.length;
        
        // Calculate product of elements on the left side
        int[] leftProduct = new int[length];
        leftProduct[0] = 1;
        for (int i = 1; i < length; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }
        
        // Calculate product of elements on the right side
        int rightProduct = 1;
        for (int i = length - 1; i >= 0; i--) {
            leftProduct[i] *= rightProduct;
            rightProduct *= nums[i];            
        }

        return leftProduct;
    }
    
    /*
     * MAJORITY ELEMENt
     * Given an array nums of size n, return the majority element.
     *
     * The majority element is the element that appears more than n / 2 times.
     * You may assume that the majority element always exists in the array.
     */
    
    //This solution uses sorting algorithm
    public static int majorityElement1(int[] nums) {
        int count = 0;
        int majority = nums.length / 2;
        int majorElement = nums[0];
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++, count=0) {
            if(nums[i] == nums[i-1]){
                count++;
                if(count >= majority){
                    majorElement = nums[i];
                }
            }
        }
        return majorElement;
    }
    
    //This uses Boyer-Moore Voting Algorithm
    //The algorithm keeps track of a candidate majority element and a counter.
    public static int majorityElement2(int[] nums) {
        int count = 0;
        int candidate = nums[0];

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            // If the current element is equal to the candidate, increment count; otherwise, decrement count.
            count += (num == candidate) ? 1 : -1; 
        }

        return candidate;
    }
}
