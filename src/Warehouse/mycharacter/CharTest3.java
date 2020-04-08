package Warehouse.mycharacter;

//объединить в цикле мелкую и заглавную букву
public class CharTest3 {

    private static Character ch;
    private static int value = 1;

    public static void main(String[] args) {

        ch = 'a';
        System.out.println("----------------------");
        System.out.println("letters");
        System.out.println("----------------------");
        for (int i = 1; i < 27; i++) {
            System.out.println("value: " + value + " char:" + ch);
            //Character.toLowerCase(ch);
            System.out.println("value: " + value + " char:" + Character.toUpperCase(ch));

            value++;
            ch++;
        }
    }
}
