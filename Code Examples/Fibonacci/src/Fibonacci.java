public class Fibonacci {

    public static void main(String[] args) {
        int answer = Fibonacci(7);
        System.out.println(answer);
        int ans = FibonacciRecursive(7);
        System.out.println(ans);
        System.out.println(fib2(7,0,0,1));
    }

    public static int Fibonacci(int n) {
        int first = 0;
        int second = 1;
        int third = 0;

        int count = 0;
        while (count < n) {
            third = first + second;
            first = second;
            second = third;
            count+=1;
        }
        return first;
    }

    public static int FibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return FibonacciRecursive(n-1) + FibonacciRecursive(n-2);
    }

    public static int fib2(int n, int k, int f0, int f1) {
        if(n == k) {
            return f0;
        } else {
            return fib2(n,k+1,f1, f0 + f1);
        }
    }
}
