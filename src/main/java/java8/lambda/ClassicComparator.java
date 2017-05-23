package java8.lambda;

import java8.domain.Developer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author : yion
 * @Date : 2016. 8. 19.
 * @Description : 기본 비교 및 정렬
 */
public class ClassicComparator {

    public static void main(String[] args) {

        List<Developer> listDevs = Developer.getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        //sort by age
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("After Sort by age ");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        /*
        //sort by age
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //sort by name
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //sort by salary
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });
        */

    }

}
