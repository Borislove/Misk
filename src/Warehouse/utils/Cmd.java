package Warehouse.utils;

import java.io.IOException;

public class Cmd {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        rt.exec(new String[]{"cmd.exe", "/c", "start"});
    }
}
