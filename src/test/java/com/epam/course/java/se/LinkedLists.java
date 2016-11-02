package com.epam.course.java.se;

import org.junit.Test;

import java.util.LinkedList;

public class LinkedLists {
    // FIFO
    // LIFO

    @Test
    public void test1(){
        final LinkedList<String> queue = new LinkedList<>();
        queue.addFirst("a");
        System.out.println(queue.removeFirst());
        System.out.println(queue.pollFirst());

        queue.addLast("b");
        System.out.println(queue.removeLast());
        System.out.println(queue.pollLast());

        queue.add("1");
        queue.add("2");
        queue.add("3");
        System.out.println(queue.poll());
        System.out.println(queue.remove());

    }

    @Test
    public void lifo() {
        final LinkedList<String> queue = new LinkedList<>();

        queue.addFirst("1");
        queue.addFirst("2");
        queue.addFirst("3");
        queue.addFirst("4");
        System.out.println(queue.removeFirst());
    }

    @Test
    public void fifo() {
        final LinkedList<String> queue = new LinkedList<>();

        queue.addFirst("1");
        queue.addFirst("2");
        queue.addFirst("3");
        queue.addFirst("4");
        System.out.println(queue.removeLast());
    }

    @Test
    public void fifo2() {
        final LinkedList<String> queue = new LinkedList<>();

        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.addLast("5");
        System.out.println(queue.remove());
        System.out.println(queue.removeFirst());
//        System.out.println(queue.removeLast());
    }

    @Test
    public void lifo2() {
        final LinkedList<String> queue = new LinkedList<>();

        queue.push("1");
        queue.push("2");
        queue.push("3");
        queue.push("4");
        queue.push("5");
        System.out.println(queue.pop());
        System.out.println(queue.pop());
//        System.out.println(queue.removeLast());
    }
}
