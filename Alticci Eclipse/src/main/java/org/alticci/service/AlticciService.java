package org.alticci.service;

import org.springframework.stereotype.Service;

@Service
public class AlticciService {

    public long getAlticciValue(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            long a = 0;
            long b = 1;
            long c = 1;
            long result = 0;
            for (int i = 3; i <= n; i++) {
                result = a + b;
                a = b;
                b = c;
                c = result;
            }
            return result;
        }
    }
}