import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;


public class Algorithm2{
// 	public static int[] addOne(int nums[], int t){
// 		int[] ans = new int[nums.length+1];
// 		for (int i = 0;i<=nums.length-1 ;i++ ) {
// 			if (t >= nums[i]){
// 				ans[i] = nums[i];
// 			}
// 			else if(t <= nums[i]){
// 				if(t >= nums[i-1]){
// 					ans[i] = t;
// 					ans[i+1] = nums[i];
// 				}
// 				else{
// 					ans[i+1] = nums[i];
// 				}
// 			}
// 		}

	public static int countIsland(int[][] a){
		int count = 0;
		int[][] b = new int[a.length+1][a[0].length+1];

		for (int i = 0 ;i <= b.length-1;i++ ) {
			for (int j = 0;j <= b[0].length-1; j++) {
				b[0][j] = 0;
				b[i][0] = 0;
			}
		}

		for (int i = 1;i <= a.length ;i++ ) {
			for (int j = 1;j <= a[0].length ; j++) {
				b[i][j] = a[i-1][j-1];
			}
			
		}

		for (int i = 0 ;i <= b.length-1;i++ ) {
			for (int j = 0;j <= b[0].length-1; j++) {
				if (b[i][j]==1){
					if(b[i][j]==1 && b[i-1][j]!=1 & b[i][j-1]!=1){
						count++;
					}
				}
			}
		}
		return count;
	}

	// 	return ans;
	// }

	// static int[] sumTwo(int[] nums, int target){
	// 	Map<Integer,Integer> a = new HashMap<>();
	// 	int[] ans = new int[2];
	// 	for (int i = 0;i<=nums.length-1 ; i++) {
	// 		if(!a.containsKey(nums[i])){
	// 			a.put(target-nums[i],i);
	// 		}
	// 		else{
	// 			ans[0] = a.get(target-nums[i]);
	// 			ans[1] = i;
	// 		}
	// 	}

	// 	return ans;

	// }

	public static void main(String[] args) {
		int[] a = {2,4,5,9,11};
		int[][] island = {
			{1,1,0,0},
			{1,1,0,1},
			{0,1,1,0},
			{0,0,1,1}
		};
		int target = 7;
		// String toString(int[] k){
		// 	return "["+ k[0]+"," + k[1] + "]";
		// }
		System.out.println(countIsland(island));

		Object o = "test";
		String a = o;
		Integer.value("1234")
	}
}