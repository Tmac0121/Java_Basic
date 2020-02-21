public class Exam{
		public static void primeNumbers(int n){
			for (int i=2;i<=n ;i++ ) {
				for (int j=2; j<i;j++) {
					if(i%j==0&&i!=j) {
					j=i;
				}
				else if(i%j!=0){
					if(j!=i-1){
						continue;
					}else
					System.out.println(i);
			}
		}
	}
}




	public static void main(String[] args) {
		primeNumbers(30);
	}
}