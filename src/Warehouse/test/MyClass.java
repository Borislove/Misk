package Warehouse.test;


public class MyClass {

    static int a = 5;
    static int b = 6;

    public int summ(int c, int d) {
        return c / d;
    }

    public static int[] myMassive = {13, 15, 25, 11, 15}; //79

    public static int calc() {

        int summ = 0;
        for (int i = 0; i < myMassive.length; i++) {
            //  System.out.println(i);
            summ += myMassive[i];
        }
        return summ;
    }

    public static void main(String[] args) {
        //  MyClass one = new MyClass();
//        one.summ(2, 3);  //переменные в метод
        //System.out.println(one.summ(6, 3));
//        System.out.println();
        //System.out.println(summ(1, 2));
        //one.summ(2, 3);

        //      one.summ(3, 4);

        //  System.out.println(myMassive[4]);
        //   calc();
        System.out.println(calc());
    }
}
