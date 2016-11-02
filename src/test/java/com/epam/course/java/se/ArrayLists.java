package com.epam.course.java.se;

import org.junit.Test;

import java.util.ArrayList;

public class ArrayLists {
    @Test
    public void test1() {
        final ArrayList<String> strings = new ArrayList<>();
        strings.add(0, "");
    }

    @Test
    public void array() {
//        final int[] ints = {1, 2, 3};

//        final Integer[] integers = {1001, 1002, 1003};

        final ArrayList<Integer> integers = new ArrayList<>(3);
        integers.add(1001);
        integers.add(1002);
        integers.add(1003);


    }
}
