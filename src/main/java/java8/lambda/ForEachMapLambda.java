package java8.lambda;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : yion
 * @Date : 2016. 8. 19.
 * @Description : https://www.mkyong.com/java8/java-8-foreach-examples/ 예제
 * ClassicMapDemo.java -> ForEach Lambda 변환
 */
public class ForEachMapLambda {
    // In Java 8, you can loop a Map with forEach + lambda expression.
    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach((k , v) -> System.out.println("normal Item : " + k + " Count : " + v));

        items.forEach((k, v) -> {
            System.out.println("Condition Item : " + k + " Count : " + v);

            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });
    }


}
