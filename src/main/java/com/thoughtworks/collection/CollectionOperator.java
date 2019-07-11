package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class CollectionOperator {

  public List<Integer> getListByInterval(int left, int right) {
    int min = Math.min(left, right);
    int max = Math.max(left, right);
    return IntStream.rangeClosed(left, right).boxed()
        .sorted(right<left?Comparator.reverseOrder()
            :Comparator.naturalOrder()).collect(Collectors.toList());
  }

  public List<Integer> getEvenListByIntervals(int left, int right) {
//        int min = Math.min(left,right);
//        int max = Math.max(left,right);
    return getListByInterval(left, right).stream().
        filter(e -> e % 2 == 0).sorted().collect(Collectors.toList());
  }

  public List<Integer> popEvenElments(int[] array) {
    return Arrays.stream(array).filter(e -> e % 2 == 0).boxed()
        .collect(Collectors.toList());
  }

  public int popLastElment(int[] array) {
    return Arrays.stream(array).boxed()
        .collect(Collectors.toList()).get(array.length - 1);
  }

//  public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
//     //ToDo
//  }

//  public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
//      //ToDo
//  }
}
