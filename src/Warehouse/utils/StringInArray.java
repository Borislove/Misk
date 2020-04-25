package Warehouse.utils;

import java.util.Arrays;

public class StringInArray {

    public static void main(String[] args) {


        String str = "test";

        // String array[] = {str};
        //System.out.println(Arrays.toString(array));
        //  str.toCharArray();


        //System.out.println(str.toCharArray());


        // System.out.println(Arrays.toString(str.toCharArray()));


        char text = ' ';


        for (char value : str.toCharArray()) {
            //   System.out.println(value);
            char array[] = new char[]{value};
            System.out.print(Arrays.toString(array));
            Arrays.sort(array);

            if (value == 't') {
                array[0] = 'a';
                System.out.print(Arrays.toString(array));
                break;
            }
        }
//        System.out.println(text);

    }
}
