package br.com.accurate.advanced.coding;

class Mdc {

    // Algoritimo de Euclides
    private static int mdc(int m, int n) {
        if(n == 0)
            return m;
        return mdc(n, m % n);
    }

    static int mdcList(int[] nl) {
        if(nl.length < 2) return 0;
        int mdcR = nl[0];
        for (int i = 1; i < nl.length; i++){
            mdcR = mdc(mdcR, nl[i]);
        }
        return mdcR;
    }

    // Brute Force
    static int mdcBF(int m, int n) {
        int mdc = 1;
        for (int i = 1; i <= m && i <= n; i++) {
            if (m % i == 0 && n % i == 0) {
                mdc = i;
            }
        }
        return mdc;
    }

    // Stein
    static int mdcStein(int m, int n) {
        if (m == 0) return n;
        if (n == 0) return m;

        int i;
        for (i = 0; ((m | n) & 1) == 0; i++) {
            m >>= 1;
            n >>= 1;
        }

        while ((m & 1) == 0) {
            m >>= 1;
        }

        do {
            while ((n & 1) == 0) {
                n >>= 1;
            }

            if (m > n) {
                int temp = m;
                m = n;
                n = temp;
            }
            n = (n - m);
        } while (n != 0);

        return m << i;
    }

}
