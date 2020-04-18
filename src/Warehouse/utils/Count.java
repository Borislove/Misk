package Warehouse.utils;

//подсчет времени
public class Count {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //вычисление
        for (int i = 0; i <10000000 ; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("Продолжительность вычислений: "+(end-start) +"миллисекунд");
    }
}
