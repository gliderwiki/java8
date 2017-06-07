package algorithm.lru;

import java.util.Map;

/**
 * @Author : yion
 * @Date : 2017. 6. 1.
 * @Description :
 */
public class MainApp {
    public static void main(String[] args) {
        LRUCache<String, String> c = new LRUCache<>(3);

        c.put("1", "one");      // 1
        for (Map.Entry<String, String> e : c.getAll()) {
            System.out.println( e.getKey());
        }
        c.put("2", "two");      // 2 1
        c.put("3", "three");    // 3 2 1
        c.put("4", "four");     // 4 3 2



        if (c.get("2") == null) {
            throw new Error();  // 2 4 3
        }

        c.put("5", "five");     // 5 2 4
        c.put("4", "four");     // 4 5 2

        for (Map.Entry<String, String> e : c.getAll()) {
            System.out.println( e.getKey());
        }



        if (c.usedEntries() != 3) {
            throw new Error();
        }

        for (Map.Entry<String, String> e : c.getAll()) {
            System.out.print( e.getKey());
        }


        if (!c.get("4").equals("second four")) {
            System.out.println("ERROR");
        }
        for (Map.Entry<String, String> e : c.getAll()) {
            System.out.print( e.getKey());
        }


        if (!c.get("2").equals("two")) {
            throw new Error();
        }


    }
}
