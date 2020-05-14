package com.epam;

import java.util.ArrayList;
import java.util.List;

public class SomeClass {
    public static boolean isPrime(int n) {
        if (n > 1) {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static List<Integer> getFibonacciSequence(int n) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);
        for (int i = 2; i < n - 1; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        return list;
    }

}
