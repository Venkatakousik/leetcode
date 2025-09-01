/*
 * 541. Reverse String II
Easy
Topics
premium lock icon
Companies
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

 

Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"
 

Constraints:

1 <= s.length <= 104
s consists of only lowercase English letters.
1 <= k <= 104
 */

package leetcode;

import java.util.Arrays;

public class Leetcode541 {

	public static void main(String[] args) {
		String s ="abcdefg";
		int k=2;
		System.out.print(reverseStr(s,k));

	}
	
	public static String reverseStr(String s, int k) {
		char[] ch =s.toCharArray();
		for(int i=0;i<ch.length-k;i+=k+k) {
			int e=i+k-1;
			int s1=i;
			while(s1<e) {
				char temp =ch[s1];
				ch[s1] =ch[e];
				ch[e]=temp;
				e--;
				s1++;				
				}
			
		}
	    return new String(ch); 
	    }

}
