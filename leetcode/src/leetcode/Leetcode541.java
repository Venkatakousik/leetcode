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


/*
*Solution :
*  Step 1: converting the String to charector Array using toChararray().
*  Step 2: declaring pointers i = starting point , j=end point.
*  step 3:Cheaking the  charector one by one whether it is letter or not. using( isLetter())
*  step 4: if it is not letter we will increment the starting point(i) or decreasing the ending point(j) 
*  step 5: if both are letters then we swap.
*  step 6: move the pointers until both crossing.
*  step 7: After that converting the Array to String using new String() method.
*
* hint 
*  solution 2 : we can use Stringbuilder concept also it will decrease the space complexity to O(1)
*/


/*
*  COMPLEXITY :
*	TIME :  O(n)
*   SPACE : O(n)
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
