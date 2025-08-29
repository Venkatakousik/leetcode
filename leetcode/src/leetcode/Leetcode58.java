/*
 * Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.



 */


/*
 * SOLUTION : 
 * step 1 : Here we first split the String into array by split(" ") here we use trim method also to remove spaces at ending 
 * Step 2 : The we store the last String in a variable 
 * Step 3 : Here we can get length of the String
 */

/*
 * Time complexity  : O(n)
 * Space Complexity : O(n)
 */

package leetcode;
import java.util.*;
public class Leetcode58 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String a =sc.nextLine();
	System.out.print(len(a));
	}
	
	static int len(String a) {
		String[] s = a.trim().split(" ");		
		String las =s[s.length-1];
		System.out.print(las);
		return las.length();
	}

}
