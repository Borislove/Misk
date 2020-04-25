package Warehouse;

//подсчет букв и цифр
// когда спец символы?...
public class Test12 {

    private static String str = "Hello world234981 abc  1  3 5 6 l ";

    private static char[] result = str.toCharArray();

    static void isLetter() {
        int countCh = 0;  //буквы
        int countDig = 0; //цифры
        //пробелы! длина -буквы -цифры?

        for (Character c : result) {

            System.out.print(c + " ");
            System.out.println(c.isLetter(c));

            if (c.isLetter(c)) {
                countCh++;
            }

            if (c.isDigit(c)) {
                countDig++;
            }
        }
        System.out.println("длина строки: " + str.length());
        System.out.println("количество пробелов " + (str.length() - countCh - countDig));
        System.out.println("всего букв: " + countCh);
        System.out.println("всего цифр: " + countDig);
    }

    public static void main(String[] args) {
        isLetter();
    }
}
