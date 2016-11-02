package com.epam.course.java.se;

import org.junit.Test;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;

public class EnumSets {
    enum TestEnum {
        A, B, C, D, E
    }

    enum TestEnum2 {
        X
    }

    @Test
    public void test1() {
        System.out.println(TestEnum.A.ordinal());

        System.out.println(EnumSet.noneOf(TestEnum.class));

        final EnumSet<TestEnum> ae = EnumSet.of(TestEnum.A, TestEnum.E);
        System.out.println(ae);

        final EnumSet<TestEnum> bd = EnumSet.of(TestEnum.B, TestEnum.D);

        System.out.println(EnumSet.range(TestEnum.B, TestEnum.D));

        System.out.println(EnumSet.complementOf(bd));

    }

    @Test
    public void test2() {
        final EnumMap<TestEnum, String> map1 = new EnumMap<>(TestEnum.class);
        final EnumMap<TestEnum, String> map2 = new EnumMap<>(map1);
        final HashMap<TestEnum, String> hashMap = new HashMap<>();
        hashMap.put(TestEnum.A, "a");
        final EnumMap<TestEnum, String> map3 = new EnumMap<>(hashMap);
        System.out.println(map3);
    }
}
