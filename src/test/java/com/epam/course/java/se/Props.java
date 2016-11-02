package com.epam.course.java.se;

import org.junit.Test;

import java.util.Map;
import java.util.Properties;

public class Props {
    @Test
    public void test1() {
        final Properties properties = System.getProperties();
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
