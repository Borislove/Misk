package Warehouse.utils;

import java.io.File;

public class ListContents {
    public static void main(String[] args) {
        File file = new File("E:\\Java library");
        String[] files = file.list();

        System.out.println("Listing contents of " + file.getPath());
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}

