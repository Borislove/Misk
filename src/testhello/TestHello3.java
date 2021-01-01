package testhello;

public class TestHello3 {

    public static void main(String[] args) throws InterruptedException {

        String str = "Привет";

        sleeping(500);
        System.out.print(str + "\b" + "\b" + "\b" + "\b" + "\b" + "\r");
        sleeping(500);
        System.out.print(str + "\b" + "\b" + "\b" + "\b" + "\r");

        sleeping(500);
        System.out.print(str + "\b" + "\b" + "\b" + "\r");

        sleeping(500);
        System.out.print(str + "\b" + "\b" + "\r");

        sleeping(500);
        System.out.print(str + "\b" + "\r");

        sleeping(500);
        System.out.print(str);

        for (int i = 0; i < 10; i++) {
            sleeping(400);
            System.out.print("!");
            sleeping(400);
            System.out.print("\b");
        }

    }

    static void sleeping(int sleep) throws InterruptedException{  //исключение прерывания
        Thread.sleep(sleep);
    }
}
