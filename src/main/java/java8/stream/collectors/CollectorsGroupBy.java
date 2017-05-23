package java8.stream.collectors;

import java8.domain.Item;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author : yion
 * @Date : 2016. 8. 22.
 * @Description : https://www.mkyong.com/java8/java-8-collectors-groupingby-and-mapping-example/
 */
public class CollectorsGroupBy {

    public static void main(String[] args) {
        //3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        items.forEach(System.out::println);

        // 자료 전체를 다 쓰기 때문에 나중에 입력된 것이 먼저 나옴
        Map<String, Long> result = items.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));

        System.out.println("result : " + result); //  {papaya=1, orange=1, banana=2, apple=3}

        // add sorting
        Map<String, Long> finalMap = new LinkedHashMap<>();

        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println("finalMap result : " + finalMap);

        List<Item> list = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orange", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );

        //Group by + Count
        Map<String, Long> countMap = list.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.counting())
        );

        System.out.println("countMap : " + countMap); // {papaya=1, orange=1, banana=2, apple=3, watermelon=1}

        //Group by + Sum qty
        Map<String, Integer> sumMap = list.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty))
        );

        System.out.println("sumMap : " + sumMap);

        //group by price
        Map<BigDecimal, List<Item>> groupByPriceMap = list.stream().collect(
                Collectors.groupingBy(Item::getPrice)
        );

        System.out.println("groupByPriceMap : " + groupByPriceMap);
        // {19.99=[Item{name='banana', qty=20, price=19.99}, Item{name='banana', qty=10, price=19.99}],
        // 29.99=[Item{name='orange', qty=10, price=29.99}, Item{name='watermelon', qty=10, price=29.99}],
        // 9.99=[Item{name='apple', qty=10, price=9.99}, Item{name='papaya', qty=20, price=9.99},
        // Item{name='apple', qty=10, price=9.99}, Item{name='apple', qty=20, price=9.99}]}

        // group by price, uses 'mapping' to convert List<Item> to Set<String>
        Map<BigDecimal, Set<String>> setResult = list.stream().collect(
                Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet()))
        );

        System.out.println("setResult : " + setResult);  // {19.99=[banana], 29.99=[orange, watermelon], 9.99=[papaya, apple]}

    }
}
