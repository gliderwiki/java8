package com.libqa.stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author : yion
 * @Date : 2016. 8. 22.
 * @Description : https://www.mkyong.com/java8/java-8-streams-filter-examples/
 */
public class CollectStreamFilter {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("kim", "lee", "park");

        // Normal Java example to filter a List.
        List<String> results = getFilterOutput(lines, "park");

        for (String s : results) {
            System.out.println("result : " + s);
        }


        // The equivalent example in Java 8, using stream.filter() to filter a List, and collect() to convert a stream.
        List<String> result = lines.stream()
                .filter(line -> !"park".equals(line))
                .collect(Collectors.toList());


        result.forEach(t -> System.out.println("result filter : " + t ));
    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();

        for (String s : lines) {
            if (!filter.equals(s)) {
                result.add(s);
            }
        }

        return result;
    }
}
