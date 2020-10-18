package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        return array.stream().filter(evenFinder -> evenFinder % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(multipleof3 -> multipleof3 % 3 == 0).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return firstList.stream().filter(firstElement -> secondList.stream().anyMatch(secondElement -> secondElement.equals(firstElement))).collect(Collectors.toList());
    }
}
