package Warehouse.algoritm;

public class Test {

    public static boolean containsDigit(int number, int digit) {
        while (number > 0) {
            if (number % 10 == digit) {
                System.out.println("содержит");
                return true;
            }else
            number /= 10;

        }
        return false;
    }


    public static void main(String[] args) {

        containsDigit(13121, 0);
    }
}
