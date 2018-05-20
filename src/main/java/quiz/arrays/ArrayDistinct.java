package quiz.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @Author : yion
 * @Date : 2018. 5. 14.
 * @Description :
 */
public class ArrayDistinct
{
    public static void main(String[] args) {
        int a[] = new int[]{12,44,23,56,9,23,78,13};

        int min = a[0];
        int index=0;

        for(int i = 0; i < a.length; i++)
        {
            if(min > a[i])
            {
                min = a[i];
                index=i;
            }
        }

        System.out.println("Index position of Smallest value in a given array is  :  "+index);
    }

}
