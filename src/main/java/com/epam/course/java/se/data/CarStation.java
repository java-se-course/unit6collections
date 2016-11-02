package com.epam.course.java.se.data;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarStation {
    private final Set<Car> cars;

    public CarStation(Set<Car> cars) {
        this.cars = cars;
    }

    public Set<Car> getAvailableCars() {
//        return new HashSet<>(cars);
        return Collections.unmodifiableSet(cars);
    }
}
