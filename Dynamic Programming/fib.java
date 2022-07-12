import java.util.*;

class fib
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<=1) return;
        int dp[] = new int[n+1];
        dp[1]=1; 
        System.out.println(fibonacci(dp,n));

    }

    public static int fibonacci(int dp[],int n)
    {
        if(n<=1) return n;

        
        // using subproblem which stores
        if(dp[n]!=0) return dp[n];


      //storing subproblems result
        return dp[n] = fibonacci(dp,n-1)+fibonacci(dp,n-2);
    }
}