import java.util.Arrays;

public class Plusone{
	public static int[] solution(int[] digits){
		// int ans[] = digits[];
		// l = ;
		for(int i=digits.length-1;i>0;i--){
			if (digits[i]!=9){
				digits[i]++;
				// digits[i-1]++;
				return digits;
			}
			else{
				digits[i]=0;
				// return digits;
			}
		}
		int[] ans = new int[digits.length+1];
			ans[0] = 1;
			return ans;
	}

	public static void main(String[] args) {
		int[] a ={9,9,9};
		System.out.println(Arrays.toString(solution(a)));
	}
}