package com.epam.course.java.se;

import org.junit.Test;

import java.util.BitSet;

public class BitSets {
    // 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 []
    // 00000100 00000000 00000000 00000000 00000000 00000000 00000000 00000000 [5]
    // 00000100 00000000 00000000 00000000 00000000 00000000 00000000 00000001 [5, 63]
    // 10000100 00000000 00000000 00000000 00000000 00000000 00000000 00000001 [0, 5, 63]
    //

    @Test
    public void test1() {
        final BitSet bitSet = new BitSet();
        bitSet.set(5);
//        bitSet.set(5, false);
        bitSet.clear(5);

        bitSet.set(5);
        System.out.println(bitSet);
        System.out.printf("length: %d, size: %d\n", bitSet.length(), bitSet.size());

        bitSet.set(1000);
        System.out.println(bitSet);
        System.out.printf("length: %d, size: %d\n", bitSet.length(), bitSet.size());

        bitSet.set(1000, false);
        System.out.println(bitSet);
        System.out.printf("length: %d, size: %d\n", bitSet.length(), bitSet.size());
    }
}
