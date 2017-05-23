package java8.join;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @Author : yion
 * @Date : 2016. 8. 22.
 * @Description : https://www.mkyong.com/java8/java-8-stringjoiner-example/
 */
public class StringJoin {
    public static void main(String[] args) {
        // Join String by a delimiter
        StringJoiner sj = new StringJoiner(",");
        sj.add("AAA");
        sj.add("BBB");
        sj.add("CCC");

        String result = sj.toString(); // result = AAA,BBB,CCC
        System.out.println("result = " + result);

        // Join String by a delimiter and starting with a supplied prefix and ending with a supplied suffix.
        StringJoiner sj2 = new StringJoiner("/",  "prefix-", "-suffix");
        sj2.add("2016");
        sj2.add("08");
        sj2.add("22");

        System.out.println("String Joiner  = " + sj2.toString());  //  prefix-2016/08/22-suffix

        String joinString = String.join("-", "2015", "10", "31" );

        System.out.println("String join = " + joinString);  // 2015-10-31

        List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
        //java, python, nodejs, ruby
        String listJoin = String.join(", ", list);

        System.out.println("listJoin = " + listJoin); // java, python, nodejs, ruby

        String collectorJoin = list.stream().map(x -> x).collect(Collectors.joining(" | "));

        System.out.println("collectorJoin = " + collectorJoin);  // java | python | nodejs | ruby


    }
}
