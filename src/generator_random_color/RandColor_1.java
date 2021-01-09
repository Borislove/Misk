package generator_random_color;

public class RandColor_1 {
    static String text = "Съешь ещё этих мягких французских булок, да выпей же чаю.";

    static int colorNumb = 0;

    static String[] colors = {
            "\u001B[31m",
            "\u001B[32m",
            "\u001B[33m",
            "\u001B[34m",
            "\u001B[35m",
            "\u001B[36m",
            "\u001B[37m"
    };

    public static int colorRand() {
        colorNumb = (int) (Math.random() * colors.length);
        return colorNumb;
    }

    static char[] ch = text.toCharArray();
    static char aChar = ' ';
    static String str = " " + aChar;


    public static void start() throws InterruptedException {
       // for (Character value : ch) {
          //  aChar = value;
          //  colorRand();
          //  str += aChar + colors[colorNumb];

            for (int i = 0; i < ch.length; i++) {
                sleep(150);
                colorRand();
                System.out.print(ch[i]+colors[colorNumb]);

            }

      //  }
       // System.out.println(str);
    }

    public static void sleep(int i) throws InterruptedException {
        Thread.sleep(i);
    }


    public static void main(String[] args) throws InterruptedException {
        /*start();
        System.out.println("");
        start();

        start();*/

        while (true){
            start();
            System.out.println("");
        }
    }
}
