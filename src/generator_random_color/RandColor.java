package generator_random_color;

public class RandColor {
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


    public static void start(){
        for (Character value : ch) {
            aChar = value;
            colorRand();
            str += aChar + colors[colorNumb];
        }
        System.out.println(str);
    }


    public static void main(String[] args) {
        /*for (Character value : ch) {
            aChar = value;
            colorRand();
            str += aChar + colors[colorNumb];
        }
        System.out.println(str);*/
        //start();
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            start();
        }
    }
}
