package leetcode;

public class BuySellStocks121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,6,5,0,3};
		int result=buy(arr);
		System.out.print(result);
	}
	
	static int buy(int[] arr) {
		if(arr.length<=1) {
			return 0;
		}
		int buy =arr[0];
		int sell=arr[0];
		int result =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<buy) {
				buy=arr[i];
			}
			else {
				sell=arr[i];
				if(result<sell-buy) {
					result =sell-buy;
				}
			}
		}
			
		return result;
	}

}
