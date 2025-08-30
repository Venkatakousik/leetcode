/*
 * You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:

1 <= n <= 45
 */



/*
 * N=4;
 * ways to step;
 * STEP 1:1+1+1+1
 * Step 2:2+2
 * Step 3:1+1+2
 * Step 4:2+1+1
 * Step 5:1+2+1
 * 
 * fib : 1+1+2+3+5  ans: 5
 */











package leetcode;
import java.util.Scanner;
public class Leetcode70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.print(steps(n));
	}
	
	static int steps(int n) {		
		int a =1;
		int b =1;
		for(int i=2;i<=n;i++) {
			int c =a+b;
			a=b;
			b=c;			
		}
		return n==1? 1 :  b;
	}

}
