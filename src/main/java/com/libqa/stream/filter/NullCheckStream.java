package com.libqa.stream.filter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author : yion
 * @Date : 2016. 8. 25.
 * @Description : https://www.mkyong.com/java8/java-8-filter-a-null-value-from-a-stream/
 */
public class NullCheckStream {
    public static void main(String[] args) {
        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

        //List<String> result = language.collect(Collectors.toList()); // Stream containing null

        // To solve it, uses Stream.filter(x -> x!=null)
        List<String> result = language.filter(x -> x != null).collect(Collectors.toList());

        // or Objects::nonNull
        // List<String> result = language.filter(Objects::nonNull).collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
