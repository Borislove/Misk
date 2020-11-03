package Warehouse;

import java.util.Arrays;

public class Test999 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};  //55
      //  int[] arr = {1, 4, 6, 3, 10, 214, 445}; //683
        System.out.println(Arrays.toString(arr));

        int summ = 0;
        for (int a = 0; a < arr.length; a++) {
            //  System.out.println(a);
            summ += arr[a];
            System.out.println(summ);
        }
    }
}
