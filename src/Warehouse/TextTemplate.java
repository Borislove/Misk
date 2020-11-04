package Warehouse;

//шаблон
public class TextTemplate {
    public static void main(String[] args) {

        String str = "[]()~" ;

        for (int i = 0; i < 181 ; i++) {
            System.out.println(i + ". "+str);
            System.out.println(); //пробел, как же без него
        }
    }
}
