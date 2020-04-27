package Warehouse.calc;

//5.1
public class Calc {
    int a, b, c;

    public Calc(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sum() {
        return a + b + c;
    }

    public int mul() {   //multiply
        return a * b * c;
    }

    public static void main(String[] args) {
        Calc calc = new Calc(2, 3, 4);
        System.out.println("сумма");
        System.out.println(calc.sum());

        System.out.println("произведение");
        System.out.println(calc.mul());
    }
}
