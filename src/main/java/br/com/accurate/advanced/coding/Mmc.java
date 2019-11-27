package br.com.accurate.advanced.coding;

class Mmc {

    static int mmc(int m, int n) {
        return m * (n / Mdc.mdc(m, n));
    }

    static int mmcList(int[] nl) {
        if(nl.length < 2) return 0;
        int mmcR = nl[0];
        for (int i = 1; i < nl.length; i++){
            mmcR = mmc(mmcR, nl[i]);
        }
        return mmcR;
    }


}
