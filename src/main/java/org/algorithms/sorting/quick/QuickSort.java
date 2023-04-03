package org.algorithms.sorting.quick;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class QuickSort {
    public static void main(String[] args) {

    }

    private static void lPivotSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int pivot = partition(arr, left, right);

        lPivotSort(arr, left, pivot - 1);
        lPivotSort(arr, pivot + 1, right);

    }

    private static int partition(int[] arr, int left, int right) {

        int lo = left;
        int hi = right;
        int pivot = arr[left];

        /*
         * hi가 lo보다 크면서, hi의 요소가 pivot보다 작거나 같은 원소를
         * 찾을 떄 까지 hi를 감소시킨다.
         */
        while (lo < hi) {
            while (arr[hi] > pivot && lo < hi) {
                hi--;
            }

            /*
             * hi가 lo보다 크면서, lo의 요소가 pivot보다 큰 원소를
             * 찾을 떄 까지 lo를 증가시킨다.
             */
            while(arr[lo] <= pivot && lo < hi) {
                lo++;
            }

            // 교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
            swap(arr, lo, hi);

        }

        /*
         *  마지막으로 맨 처음 pivot으로 설정했던 위치(a[left])의 원소와
         *  lo가 가리키는 원소를 바꾼다.
         */
        swap(arr, left, lo);

        // 두 요소가 교환되었다면 피벗이었던 요소는 lo에 위치하므로 lo를 반환한다.
        return lo;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
