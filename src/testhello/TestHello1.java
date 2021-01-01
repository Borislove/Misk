package testhello;

import java.util.ArrayList;

public class TestHello1 {
    public static void main(String[] args) {


        String str = "Hello!";

        char[] ch = str.toCharArray();

        ArrayList ar = new ArrayList();

        for(Character value: ch){
            System.out.print(value);
            ar.add(value);
        }
    }
}
