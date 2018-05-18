package java8.parameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 동작 파리미터화(Behavior parameterization)란 : 아직은 어떻게 실행할 것인지 결정하지 않는 코드 블록을 의미
 * -	동작 파라미터화 = 동작을 파라미터로 넘김
 * -	자주 바뀌는 요구사항에 효과적으로 대응 가능
 */
public class FilteredApple {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));

        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples = filterApplesByColor(inventory, "green");
        System.out.println(greenApples);

        // [Apple{color='red', weight=120}]
        List<Apple> redApples = filterApplesByColor(inventory, "red");
        System.out.println(redApples);

        // Predicate
        List<Apple> greenApples2 = filter(inventory, new AppleColorPredicate());
        System.out.println(greenApples2);

        List<Apple> heavyApples = filter(inventory, new AppleWeightPredicate());
        System.out.println(heavyApples);

        List<Apple> redApples2 = filter(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple a) {
                return a.getColor().equals("red");
            }
        });

        System.out.println(redApples2);
    }

    private static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(apple.getColor().equals(color)){
                result.add(apple);
            }
        }
        return result;
    }


    private static List<Apple> filter(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static class Apple {
        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color){
            this.weight = weight;
            this.color = color;
        }

        public  Integer getWeight() {
            return weight;
        }

        public  void setWeight(Integer weight) {
            this.weight = weight;
        }

        public  String getColor() {
            return color;
        }

        public  void setColor(String color) {
            this.color = color;
        }

        public  String toString() {
            return "Apple{" +  "color='" + color + '\'' + ", weight=" + weight + '}';
        }
    }

    interface ApplePredicate{
        public boolean test(Apple a);
    }

    static class AppleWeightPredicate implements ApplePredicate{
        public    boolean test(Apple apple){
            return apple.getWeight() > 100;
        }
    }
    static class AppleColorPredicate implements ApplePredicate{
        public boolean test(Apple apple){
            return "green".equals(apple.getColor());
        }
    }

    static class AppleRedAndHeavyPredicate implements ApplePredicate{
        public boolean test(Apple apple){
            return "red".equals(apple.getColor())
                    && apple.getWeight() > 150;
        }
    }
}

