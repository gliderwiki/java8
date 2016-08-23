package com.libqa.stream.flatmap;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Author : yion
 * @Date : 2016. 8. 23.
 * @Description : https://www.mkyong.com/java8/java-8-flatmap-example/
 */
public class FlatMapStream {

    public static void main(String[] args) {
        /*
        Stream<String[]>		-> flatMap ->	Stream<String>
        Stream<Set<String>>	    -> flatMap ->	Stream<String>
        Stream<List<String>>	-> flatMap ->	Stream<String>
        Stream<List<Object>>	-> flatMap ->	Stream<Object>
        { {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}
        { {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}
         */

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        Stream<String[]> temp = Arrays.stream(data);

        //temp.forEach(System.out::println);  // 참조값 출력

        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        /*
        Stream<String> stream = Arrays.stream(data)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> "a".equals(x.toString()));
        */

        stringStream.forEach(System.out::println);
    }
}
