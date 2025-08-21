/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */


/* if it's not 9 
 * step 1 : check the  last digit in an array  add 1 directly to last digit 
 * 			return array
 * if it's last digit is 9
 * 
 * step 1 : convert the array to string.
 * step 2 : then convert to int then add 1.
 * step 3 : then convert string to get length.
 * step 4 : create an array by using string length
 * step 5 : then add the digit one by one from last index in new array 
 * step 6 : return array.
 * 
 */

package leetcode;

import java.util.Arrays;

public class Leetcode66 {

	public static void main(String[] args){
		int[] digits = {0,1,9,9,9,9};
		
		System.out.print(Arrays.toString(add(digits)));

	}
	
	public static int[] add(int[] digits) {
		if(digits[digits.length-1]!=9) {
			digits[digits.length-1]=digits[digits.length-1]+1;
			return digits;
		}				
		String num ="";
		for(int i=0;i<digits.length;i++) {
			num+=""+digits[i];
		}		
		//System.out.println(num);
		int num1 =Integer.parseInt(num)+1;
		String len =""+num1;
		int[] arr = new int[len.length()];
		//System.out.println(num1);
		int i=arr.length-1;
		while(num1>0) {
			arr[i] =num1%10;			
			i--;
			num1/=10;
		}
		return arr;
	}

}
