/*
 * 189. Rotate Array
Attempted
Medium
Topics
premium lock icon
Companies
Hint
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 
 */

// NORMAL SOLUTION 
/*
 * STEP 1: USE K  FOR ROTATE THE ARRAY NO OF SHIFTS 
 * STEP 2: WHEN K IS GREATER THAN ARRAY USE % FOR REDUSING THE SHIFTS FOR ABOVE AN ARRAY EX : ARRAY SIZE=10 K=2  K%A =2;
 * STEP 3: STORE THE ENDING INDEX VALUE IN TEMP*
 * STEP 4: SHIFT THE ARRAY FROM LAST 2 INDEX - LAST INDEX REPEAT THE BY DECREASING THE INDEX VALUES 
 * STEP 5: NOW ADD THE TEMP TO FIRST INDEX
 * STEP 6: NOW REAPEAT STEPS 3,4,5, UNTIL K BECOMES 0; 
 */

//OPTIMAL SOLUTION :- 
/*
 * STEP 1: USE K  FOR ROTATE THE ARRAY NO OF SHIFTS 
 * STEP 2: WHEN K IS GREATER THAN ARRAY USE % FOR REDUSING THE SHIFTS FOR ABOVE AN ARRAY EX : ARRAY SIZE=10 K=2  K%A =2;
 * STEP 3: REVERSE THE ARRAY 
 * STEP 4: REVERSE THE K SIZE IN ARRAY
 * STEP 5: NOW REVERSE THE ARRAY FROM K TO ARRAYSIZE-1 
 */



package leetcode;

import java.util.Arrays;

public class Leetcode168 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int k=3;
		k%=nums.length;
		swap(nums,0,nums.length-1); // reverse the total array
		
		swap(nums,0,k-1);  			//reverse upto k
		
		swap(nums,k,nums.length-1); //reverse from k to last index
		System.out.print(Arrays.toString(nums));

	}
	
	static int[] swap(int[] nums,int left,int right) {
		while(left<right) {
			int temp =nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			right--;
			left++;
		}
		return nums;
	}

}
