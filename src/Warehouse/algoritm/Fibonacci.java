package Warehouse.algoritm;

public class Fibonacci {

    // наивный, медленный, очевидным   //не эффективный
    //рекурсивный
    //хранение промежуточных результатов в памяти
    private static long fibNaive(int n) {
       /* if (n == 0)
            return 0;

        if (n == 1)
            return 1;*/

        //сокращение
        if (n <= 1)
            return n;

        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];  //массив где будем запоминать все числа

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }


    public static void main(String[] args) {
//        System.out.println(fibNaive(100));  //не дождаться решения
        System.out.println(fibNaive(3));
        System.out.println(fibNaive(5));
        System.out.println(fibNaive(10));

        System.out.println(fibEffective(100));
    }
}

