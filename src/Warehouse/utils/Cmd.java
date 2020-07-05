package Warehouse.utils;

import java.io.IOException;

public class Cmd {

    public static void cmd() throws IOException {
        Runtime rt = Runtime.getRuntime();
        rt.exec(new String[]{"cmd.exe", "/c", "start"});
        //rt.exec(new String[]{"cmd.exe", "/c", "start","E:result.txt"});  //запуск блокнота
        // rt.exec(new String[]{"cmd.exe", "/c", "start","e:"}); //сразу диск открывает
    }

    public static void main(String[] args) throws IOException {
        cmd();
    }
}
