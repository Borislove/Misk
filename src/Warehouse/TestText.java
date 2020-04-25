package Warehouse;

public class TestText {
    public static void main(String[] args) {
        String str = "Java";
        String str2 = "Hello";

        String str3 = String.join(" ", str2, str);

        System.out.println(str3);

        //Извлечение символов и подстрок
        String str32 = "Hello Java";
        char c = str32.charAt(6);
        System.out.println(c);


        String str199 = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst=new char[end - start];
        str199.getChars(start, end, dst, 0);
        System.out.println(dst); // world
    }


}
