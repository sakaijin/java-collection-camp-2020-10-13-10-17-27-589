package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream().collect(Collectors.averagingDouble(number-> number));
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(Integer.MIN_VALUE, Integer::max);
    }

    public int getLastOdd() {
        arrayList.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        return arrayList.get(arrayList.size() - 1);
    }
}
