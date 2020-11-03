package Warehouse.text;

//считать строку до элемента ~  и взять значения после

// TODO: 03.11.2020 первое что пришло...
public class TextText {

    public static void main(String[] args) {

        String str = "Устройство компьютера~6:00";

        /*1
        String time = str.substring(str.length() - 5);  //5 на всякий случай
        System.out.println(time);

         */

        //затолкали строку в массив символов
        char[] chArray = str.toCharArray();

        String strInput = " ";
        int index = 0;

        //перебор символов
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == '~') {  //если встретили символ
              //  System.out.println(chArray[i] + " элемент массива: " + i);
                index += i;  //значение индекса
            }

        }
      //  System.out.println(strInput);
     //   System.out.println(index);

        String test = str.substring(index);
        System.out.println(test);
    }
}
