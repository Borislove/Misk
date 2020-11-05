package Warehouse.utils;

import java.io.File;

//создание папок
public class CreatePackage {

    public static void main(String[] args) {

        int i = 31;
        for (; i < 65; i++) {

            File file = new File("E:\\JavaLessons\\src\\"+"\\lesson_"+i);
            file.mkdir();
        }
    }
}
