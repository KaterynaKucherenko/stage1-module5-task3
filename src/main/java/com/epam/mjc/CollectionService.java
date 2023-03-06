package com.epam.mjc;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> res = new LinkedList<>();
        list.stream().filter(x-> (x%2 == 0)).forEach(res :: add);
        return res;
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        List<String> result = new LinkedList<>();
        list.stream().map(String::toUpperCase).forEach(result::add);
        return result;
    }

    public Optional<Integer> findMax(List<Integer> list) {
       return list.stream().max(Integer::compare);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(Collection::stream).min(Integer::compare);}

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }
}
