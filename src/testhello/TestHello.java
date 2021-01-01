package testhello;

public class TestHello {
    public static void main(String[] args) throws InterruptedException {

        String str = "Привет";

        Thread.sleep(300);
        System.out.print(str + "\b" + "\b" + "\b" + "\b" + "\b" + "\r");
        Thread.sleep(300);
        System.out.print(str + "\b" + "\b" + "\b" + "\b" + "\r");

        Thread.sleep(300);
        System.out.print(str + "\b" + "\b" + "\b" + "\r");

        Thread.sleep(300);
        System.out.print(str + "\b" + "\b" + "\r");

        Thread.sleep(300);
        System.out.print(str + "\b" + "\r");

        Thread.sleep(300);
        System.out.print(str);

        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            System.out.print("!");
            Thread.sleep(500);
            System.out.print("\b");
        }
    }
}
