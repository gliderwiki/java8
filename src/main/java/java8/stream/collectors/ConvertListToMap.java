package java8.stream.collectors;

import java8.domain.Hosting;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author : yion
 * @Date : 2016. 8. 22.
 * @Description :
 */
public class ConvertListToMap {
    public static void main(String[] args) {
        List<Hosting> list = new ArrayList<>();

        list.add(new Hosting(1, "liquidweb.com", new Date()));
        list.add(new Hosting(2, "linode.com", new Date()));
        list.add(new Hosting(3, "digitalocean.com", new Date()));

        Map<Integer, String> result1 = list.stream().collect(
                Collectors.toMap(Hosting::getId, Hosting::getName));

        System.out.println("toMap result1 = " + result1);


        Map<Integer, String> result2 = list.stream().collect(
                Collectors.toMap(x -> x.getId(), x -> x.getName()));

        System.out.println("toMap result2 = " + result2);
    }
}
