package Warehouse.algoritm;

import Warehouse.array.Array;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] unsortedArray = {2, 1, 4, 8, 7, 5, 6, 3};
        System.out.println(Arrays.toString(unsortedArray));
        choiceSort(unsortedArray);
        bubbleSort(unsortedArray);
        insertSort(unsortedArray);
    }

    public static void choiceSort(int[] arrayToSort) {

        int[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        System.out.println("Сортировка выбором");
        //проходим по массиву
        //найти минималный элемент
        //меняем местами первый и минимальный элемент

        //повторяем пока не пройдем по всем массиву
        long start = System.nanoTime();

        int indexMin;  //хранит индекс минимального элемента
        for (int index = 0; index < array.length - 1; index++) { //посл элемент не с чем сравнивать -1
            indexMin = index;
            for (int indexToScan = index; indexToScan < array.length; indexToScan++) {
                if (array[indexMin] > array[indexToScan]) {
                    indexMin = indexToScan;
                }
            }
            int temp = array[index];
            array[index] = array[indexMin];
            array[indexMin] = temp;
        }
        long stop = System.nanoTime();
        System.out.println(stop - start);
        System.out.println(Arrays.toString(array));
    }

    //пузырьковая сортировка
    public static void bubbleSort(int[] arrayToSort) {
        int[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        System.out.println("Сортировка пузырьком");
        //проходим по массиву
        //сравнить два соседний элемента
        //повторить, пока не отсортируем
        long start = System.nanoTime();
        int changeCounter;  //счетчик изменений
        do {
            changeCounter = 0;
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    changeCounter++;
                }
            }
        } while (changeCounter > 0);
        long stop = System.nanoTime();
        System.out.println(stop - start);
        System.out.println(Arrays.toString(array));
    }


    public static void insertSort(int[] arrayToSort) {
        int[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        System.out.println("Сортировка вставками");
        //проходим по массиву
        //выбираем элемент
        //устанавливаем элемент на место
        long start = System.nanoTime();
        int element;
        int indexToInsert;
        for (int index = 0; index < array.length; index++) {
            element = array[index];

            indexToInsert = index;

            while (indexToInsert > 0
                    && array[indexToInsert - 1] > element) {
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = element;
            }
        }
        long stop = System.nanoTime();
        System.out.println(stop - start);
        System.out.println(Arrays.toString(array));
    }
}
