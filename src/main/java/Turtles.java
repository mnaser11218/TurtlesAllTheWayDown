package PACKAGE_NAME;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {
    public long factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    public int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    // non-recursive implementation
    public int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

}
