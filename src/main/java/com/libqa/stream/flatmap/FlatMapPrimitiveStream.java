package com.libqa.stream.flatmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author : yion
 * @Date : 2016. 8. 23.
 * @Description : https://www.mkyong.com/java8/java-8-flatmap-example/
 */
public class FlatMapPrimitiveStream {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};

        Stream<int[]> streamArray = Stream.of(intArray);

        IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));

        intStream.forEach(x -> System.out.println(x));

    }
}
