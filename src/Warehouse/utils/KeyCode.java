package Warehouse.utils;

public class KeyCode {
    public static void main(String[] args) {
        for (int num = 1; num < 105; num++) {
            //  System.out.println("public static final KeyCode " + "KC_" + num + " = new KeyCode (" + num + ");");
            System.out.println(" keycodes_by_name.put(" + "\"KC_" + num + "\"," + " KC_" + num + ");");
        }
    }
}
