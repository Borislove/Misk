package Warehouse.conf;

//Какие сравнения напечают true?
public class Example6 {
    public static void main(String[] args) {
        Long a = 111L;
        Long b = 111L;
        Long c = 222L;
        Long d = 222L;

        System.out.println(a == b);
        System.out.println(c == d);
    }
}
