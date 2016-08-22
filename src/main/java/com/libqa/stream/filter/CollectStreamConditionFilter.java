package com.libqa.stream.filter;

import java.util.Arrays;
import java.util.List;

/**
 * @Author : yion
 * @Date : 2016. 8. 22.
 * @Description : https://www.mkyong.com/java8/java-8-streams-filter-examples/
 */
public class CollectStreamConditionFilter {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("QuicK"),
                new Person("yion"), new Person("foo"));

        Person result = persons.stream()				   // Convert to steam
                .filter(x -> "yion".equals(x.getName()))	// we want "yion" only
                .findAny()									// If 'findAny' then return found
                .orElse(null);								// If not found, return null

        System.out.println("result = " + result.toString());

        /*
        Person result = persons.stream()
                    .filter(x -> {
                        if("yion".equals(x.getName()){
                            return true;
                        }
                        return false;
                    }).findAny()
                    .orElse(null);
         */

    }

    private static class Person {
        private String name;
        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
