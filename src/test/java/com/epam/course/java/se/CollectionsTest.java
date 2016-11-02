package com.epam.course.java.se;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionsTest {
    @Test
    public void test1() {
        final List<String> strings = new ArrayList<>(15);
        strings.add("s1");
        strings.add("s2");
        strings.add("s3");
        strings.add("s5");
        strings.add("s4");

        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void test2() {
        final String[] array = {"s1", "s2", "s3", "s5", "s4"};
        final List<String> strings = Arrays.asList(array);
        final List<String> strings2 = Arrays.asList(new String[]{"s1", "s2", "s3", "s5", "s4"});
        final List<String> strings3 = Arrays.asList("s1", "s2", "s3", "s5", "s4");

        assertEquals(strings, strings2);
        assertEquals(strings, strings3);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void test3() {
        final List<String> strings1 = Arrays.asList("s1", "s1", "s1", "s1", "s1");
        final List<String> strings2 = Collections.nCopies(5, "s1");


        assertEquals(strings1, strings2);
    }

    @Test
    public void test4() {
        final List<String> strings1 = Arrays.asList();
        final List<String> strings2 = Collections.emptyList();

        assertEquals(strings1, strings2);
    }

    @Test
    public void test5() {
        final List<String> strings = Arrays.asList("s1", "s2", "s3", "s5", "s4");

        final String[] array1 = strings.toArray(new String[strings.size()]);
        final String[] array2 = strings.toArray(new String[0]);
        final String[] array3 = strings.toArray(new String[10]);

        System.out.println(array3.length);

        for (String s : array1) {
            System.out.println(s);
        }

        assertEquals(array1, array2);
    }
}
