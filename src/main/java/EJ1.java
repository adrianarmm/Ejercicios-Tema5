
public static long EJ1(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n + EJ1(n - 1);
        }
    }

