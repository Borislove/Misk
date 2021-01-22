package generator_random_color;

public class TestRand {
    public static void main(String[] args) {

        boolean stop = true;

        int iter = 0;

        int num = 1000000000;

        while (stop) {
            int rand1 =(int) (Math.random() * num);
            //int rand1 =(int) (Math.random() * num); // TODO: 12.01.2021 скобочки!!!!
            //double rand1 = Math.random() * num;
            System.out.println(rand1);

            int rand2 =(int) (Math.random() * num);
            //double rand2 = Math.random() * num;
            System.out.println(rand2);

            if (rand1 == rand2) {
                System.err.println("rand1 = " + rand1 + " --- " + "rand2 = " + rand2);
                stop = false;
                System.out.println("iter = "+ iter);
            }

            iter++;
        }
    }
}
