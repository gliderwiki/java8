package com.libqa.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author : yion
 * @Date : 2016. 8. 23.
 * @Description : https://www.mkyong.com/java8/java-how-to-convert-array-to-stream/
 */
public class ConvertArrayToStream {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e"};

        Stream<String> stringStream1 = Arrays.stream(array);

        stringStream1.forEach(x -> System.out.println(x));

        Stream<String> stringStream2 = Stream.of(array);
        stringStream2.forEach(x -> System.out.println(x));

        int[] intArray = {1, 2, 3, 4, 5};

        // 1. Arrays.stream -> IntStream
        IntStream intStream1 = Arrays.stream(intArray);
        intStream1.forEach(x -> System.out.println(x));

        // 2. Stream.of -> Stream<int[]>
        Stream<int[]> temp = Stream.of(intArray);

        // Cant print Stream<int[]> directly, convert / flat it to IntStream
        // temp.forEach(x -> System.out.println(x));  // 참조값 출력
        IntStream intStream2 = temp.flatMapToInt(x -> Arrays.stream(x));
        intStream2.forEach(x -> System.out.println(x));

    }
}
