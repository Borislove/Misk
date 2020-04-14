package Warehouse;

public class Test10 {

    static int a = -1; //переменная а = 1

    public static void main(String[] args) {
        System.out.println(a);
        a++;
        System.out.println(a);
        if (a == 0) {
            System.err.print("a не может быть равна 0");
        }
    }
}
