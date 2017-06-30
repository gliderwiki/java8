package quiz.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author : yion
 * @Date : 2017. 6. 16.
 * @Description :
 */
public class ArraySort {
    public static void main(String[] args) {
        Integer[] myArray = { 5, 2, 7, 3, 9 };
        Arrays.sort(myArray);

        System.out.println(Arrays.toString(myArray));


        List myList = Arrays.asList(myArray);
        Collections.reverse(myList);

        //myList.toArray(myArray);


        System.out.println(Arrays.toString(myArray));
    }
}
