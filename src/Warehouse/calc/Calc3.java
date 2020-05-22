package Warehouse.calc;

public class Calc3 {

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static int multiplication(int a, int b) {
        return a * b;
    }

    private static int division(int a, int b) {
        if(b==0){
            System.err.println("ненадо так!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        division(2,0);
    }
}
