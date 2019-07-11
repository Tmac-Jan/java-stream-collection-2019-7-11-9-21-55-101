package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.stream.Collectors;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(e->e*3)
            .collect(Collectors.toList());
    }

    public List<String> mapLetter() {
          return  letterList.stream().filter(
              (x)->array.contains(letterList.indexOf(x)+1))
              .collect(Collectors.toList());
    }

//    public List<String> mapLetters() {
//        throw new NotImplementedException();
//    }

    public List<Integer> sortFromBig() {
        return array.stream().
            sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted()
            .collect(Collectors.toList());
    }
}
