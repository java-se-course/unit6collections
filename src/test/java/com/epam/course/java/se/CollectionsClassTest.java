package com.epam.course.java.se;

import org.junit.Test;

import java.util.*;

public class CollectionsClassTest {
    @Test
    public void test() {
        final List<String> strings = new ArrayList<>();
        final String[] arr = {"a", "b", "c"};
        Collections.addAll(strings, arr);
        Collections.addAll(strings, "d", "e");


        final List<Integer> integerList = new ArrayList<>();
        final List<String> fakeStringList = (List) integerList;
        fakeStringList.add("str");
        System.out.println(((List) integerList).get(0));
        final Object obj = integerList.get(0);
        System.out.println(obj);
//        final Integer integer = /*(Integer)*/integerList.get(0);
        integerList.add(666);
        final Integer integer = integerList.get(1);
        System.out.println(integer);

        final Class<? extends Integer> aClass = Integer.valueOf(1).getClass();
        final Class<Integer> integerClass = Integer.class;


        final List<Integer> checkedList = Collections.checkedList(integerList, Integer.class);
        final List<String> fakeStringList2 = (List) checkedList;
//        fakeStringList2.add("str");

        checkedList.add(1);
        final List<Integer> unmodifiableList = Collections.unmodifiableList(checkedList);
        unmodifiableList.clear();


    }

    @Test
    public void shuffles() {
        final List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");

        final List<String> strings2 = new ArrayList<>(strings);

        Collections.shuffle(strings, new Random(1));
        System.out.println(strings);

        Collections.shuffle(strings2, new Random(1));
        System.out.println(strings2);
    }
}
