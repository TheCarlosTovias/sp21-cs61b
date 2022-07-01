/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else if (n % 2 == 1) {
            return ((3 * n) + 1);
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        while (true) {

            if (n == 1) {
                System.out.println(1);
                break;
            }

            System.out.print(n + " ");
            int ans = nextNumber(n);
            n = ans;
        }

    }
}

