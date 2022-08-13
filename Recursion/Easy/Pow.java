package Recursion.Easy;

public class Pow {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == -1) {
            x = 1 / x;
            n = -n;

        }
        double temp = myPow(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
}
