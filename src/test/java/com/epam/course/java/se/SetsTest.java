package com.epam.course.java.se;

import lombok.Data;
import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class SetsTest {
    // [T] -> [T] -> [T] -> []
    // [T_N] -> [T] -> [T] -> [T] -> []

    @Data
    private static class DataClass {
        private final String name;
        private final int i;
    }

    @Test
    public void test1() {
        final TreeSet<DataClass> dataClasses = new TreeSet<>();
        dataClasses.add(new DataClass("a", 1));
        dataClasses.add(new DataClass("a", 1));
        dataClasses.add(new DataClass("a", 2));
        dataClasses.add(new DataClass("b", 1));
        for (DataClass dataClass : dataClasses) {
            System.out.println(dataClass);
        }

        final Iterator<DataClass> iterator = dataClasses.iterator();
        while (iterator.hasNext()) {
            final DataClass dataClass = iterator.next();
            System.out.println(dataClass);
            dataClasses.add(new DataClass("", 0));
        }
    }
}
