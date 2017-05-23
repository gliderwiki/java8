package java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : yion
 * @Date : 2016. 8. 19.
 * @Description : https://www.mkyong.com/java8/java-8-foreach-examples/
 * ClassicListDemo -> Lambda 변환
 */
public class ForeachListLambda {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        System.out.println("lambda ");
        items.forEach(item -> System.out.println("item : " + item));

        System.out.println("lambda condition ");
        items.forEach(item -> {
            if ("C".equals(item)) {
                System.out.println(item);
            }
        });


        System.out.println("method reference");
        items.forEach(System.out::println);

        System.out.println("Stream and filter");
        items.stream()
                .filter(s -> s.contains("B"))
                .forEach(System.out::println);

    }
}
