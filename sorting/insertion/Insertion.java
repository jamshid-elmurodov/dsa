package sorting.insertion;

import java.util.Arrays;

public class Insertion {
    static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j--];
            }

            arr[j + 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{5, 3, 4, 1, 2})));
    }
}
