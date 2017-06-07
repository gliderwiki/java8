package algorithm.sort;

import java.util.Arrays;

/**
 * @Author : yion
 * @Date : 2017. 5. 23.
 * @Description : 구현하기 쉬움
 * 반복적으로 특정 값을 정렬된 최종 위치에 배치시킴으로써 값들의 목록을 정렬한다.
 * 주어진 리스트에서 최소값을 찾아 맨 앞에 위치 시킨값과 비교하여 교체한다. 목록의 각 위치에 대해서 이러한 과정을 계속한다.
 * Performance :  O(n^2)
 */
public class SelectionSort {
    public static void main(String[] args) {
        final int[] numbers = {11, 2, 6, 3, 9, 8};

        System.out.println("Result = " + Arrays.toString(selectSort(numbers)));

    }

    private static int[] selectSort(int[] numbers) {

        // 전체 요소를 순회 한다.
        for (int index = 0; index < numbers.length-1; index++) {
            int min = index;

            // 현재 요소가 가장 작은 요소일 경우 요소의 인덱스를 바꿔준다.
            for (int scan = index+1; scan < numbers.length; scan++) {
                if (numbers[scan] < numbers[min]) {
                    min = scan;
                }
            }

            int smaller = numbers[min];
            numbers[min] = numbers[index];
            numbers[index] = smaller;

        }

        return numbers;
    }


}
