package com.libqa.lambda;

import com.libqa.domain.Developer;

import java.util.Comparator;
import java.util.List;

/**
 * @Author : yion
 * @Date : 2016. 8. 19.
 * @Description : https://www.mkyong.com/java8/java-8-lambda-comparator-example/  람다식 비교구문 및 정렬 처리 예제
 * ClassicComparator.java lambda 변환
 */
public class LambdaComparator {

    public static void main(String[] args) {
        List<Developer> listDevs = Developer.getDevelopers();

        System.out.println("Before Sort");

        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After Sort");

        /*
        // List.sort() since Java 8
        listDevs.sort(new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o2.getAge() - o1.getAge();
            }
        });
         */

        // lambda
        //listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());
        listDevs.sort((o1, o2) -> o1.getAge() - o2.getAge());

        // java 8 only, lambda also, to print the List
        listDevs.forEach((developer)-> System.out.println(developer));

        /*
        //sort by name
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //lambda
        listDevs.sort((Developer o1, Developer o2)->o1.getName().compareTo(o2.getName()));

        //lambda
        listDevs.sort((o1, o2)->o1.getName().compareTo(o2.getName()));




        //sort by salary
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });
        */

        System.out.println("sort by salary ");

        //lambda
        listDevs.sort((Developer o1, Developer o2)->o1.getSalary().compareTo(o2.getSalary()));

        //lambda
        //listDevs.sort((o1, o2)->o1.getSalary().compareTo(o2.getSalary()));
        listDevs.forEach((developer) -> System.out.println(developer));

        System.out.println("salary reversed order");
        Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
        listDevs.sort(salaryComparator.reversed());

        listDevs.forEach((developer) -> System.out.println(developer));

    }

}
