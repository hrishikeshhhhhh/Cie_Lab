public class FibonacciSeries {
    public static void generateFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series for " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to generate Fibonacci series for a different number of terms
        generateFibonacci(n);
    }
}
