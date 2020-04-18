package Warehouse.conf;

//Какой метод вызовется?
public class Example2 {
    public static void main(String[] args) {
        byte b = 1;
        action(b, b);
    }

    static void action(byte... args) {
    }

    static void action(long l1, short s2) {    // !!! самый низкий приоритет

    }

    static void action(Byte i1, Byte i2) {
    }
}
