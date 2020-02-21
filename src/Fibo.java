package

public class Fibo {
    public static int fibo1(int n){
        if(n == 0) return 1;
        if(n == 1) return 2;
        return fibo1(n-1)+ fibo1(n-2);
    }

    public static int fibo2(int n, int[] memo){
        if(memo[n] != 0) return memo[n];

        memo[n] = fibo2(n-1, memo) + fibo2(n-2, memo);

        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(fibo1(20));
//        System.out.println(fibo1(20));
    }
}
