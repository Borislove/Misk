package Warehouse.utils;

import java.text.NumberFormat;

import static java.util.Locale.US;

//Формат валюты
public class FormatCurrency {
    public static void main(String[] args) {

        int a = 100;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(a));

        NumberFormat nfUs = NumberFormat.getCurrencyInstance(US);
        System.out.println(nfUs.format(a));
    }
}
