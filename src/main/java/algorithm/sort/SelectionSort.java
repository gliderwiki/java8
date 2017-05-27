package algorithm.sort;

import java.util.Arrays;

/**
 * @Author : yion
 * @Date : 2017. 5. 23.
 * @Description : 구현하기 쉬움
 * 반복적으로 특정 값을 정렬된 최종 위치에 배치시킴으로써 값들의 목록을 정렬한다. 즉, 목록의 각 위치에 대해서 이 알고리즘은 그 위치에 배치되어야 하는 값을 선택하고, 그 값을 그 곳에 배치한다.
 * 목록 전체를 조사하여 가장 작은 값을찾는다.
 * 이 값과 목록의 첫 번째 위치에 있는 값을 교환한다.
 * 목록의 나머지 값들(첫 번째 값을 제외한 모든 값)을 조사하여 가장 작은 값을 찾고, 이 값과 목록의 두 번째 위치에 있는 값을 교환한다.
 * 목록의 나머지 값들(처음 두 번째 값을 제외한 모든 값)을 조사하여 가장 작은 값을 찾고, 이 값과 목록의 세 번째 위치에 있는 값을 교환한다.
 * 목록의 각 위치에 대해서 이러한 과정을 계속한다.
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
