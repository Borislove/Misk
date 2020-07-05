package Warehouse.utils;

public class WarmTest {
    public static long measure() {
        long st, en;
        st = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            ;
        }
        en = System.nanoTime();
        return en - st;
    }

    public static void main(String[] args) {
        System.out.println("cold start time " + String.format("%,12d", measure()) + " ns");
        System.out.println("warmed JRE time " + String.format("%,12d", measure()) + " ns");
    }
}


//cold start time    1 866 000 ns
//warmed JRE time    1 264 300 ns

//cold start time    1 933 100 ns
//warmed JRE time    1 363 300 ns

//    cold start time    1 859 300 ns
//        warmed JRE time    1 128 600 ns

//    cold start time    1 902 100 ns
//        warmed JRE time    1 165 200 ns

    /*cold start time    1 858 800 ns
        warmed JRE time    1 316 000 ns*/