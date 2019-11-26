package br.com.accurate.advanced.coding;

public class Mdc {

    public static int mdc(int m, int n) {
        if(n == 0)
            return m;
        return mdc(n, m % n);
    }
}
