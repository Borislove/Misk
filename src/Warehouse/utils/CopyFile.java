package Warehouse.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

    public static void codeFile(String inFileName, String outFileName) throws FileNotFoundException, IOException {

        FileWriter in = new FileWriter(outFileName, true);
        try {
            //чтение
            FileReader reader = new FileReader(inFileName);
            java.util.Scanner scanner = new Scanner(reader);
            //запись

            while (scanner.hasNextLine()) {
                String strFromFile = scanner.nextLine();
                in.write(strFromFile + "\n");
            }
            in.close();
            scanner.close();

        } catch (Throwable e) {
            throw new IOException("файл не найден");
        }
    }

    public static void main(String[] args) throws IOException {
        codeFile("src\\test1.txt", "src\\test1Copy.txt");
    }
}


