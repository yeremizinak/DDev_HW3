package org.example;

public class SumCalculator {
    public int sum(int n) {
        int res =0;
        for(int i=1; i<=n; i++){
            res+=i;
        }
        if (res == 0) {
            throw new IllegalArgumentException();
        }
        return res;
    }
}
