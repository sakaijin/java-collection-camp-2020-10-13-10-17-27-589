package com.thoughtworks.collection;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(multiplyBy3 -> multiplyBy3 * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        List<String> arrayString = array.stream().map(String::valueOf).collect(Collectors.toList());
        for (int x = 0; x < arrayString.size(); x++){
            arrayString.set(x, letterList.get(array.get(x) - 1));
        }
        return arrayString;
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }
}
