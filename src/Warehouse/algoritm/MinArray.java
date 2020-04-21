package Warehouse.algoritm;

import java.util.Arrays;

//минимальное значение в массиве
public class MinArray {
    public static void main(String[] args) {

        int[] array = new int[]{64, 22, 77, 21, 12, 46, 90, 80, 42, 54, 19, 28, 37, 48, 56, 99};

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("min value: " + minValue);
        System.out.println("min index: " + minIndex);

        //test
        Arrays.sort(array);
        System.out.println(array[0]);
    }
}
