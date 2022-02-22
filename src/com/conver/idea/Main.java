package com.conver.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int ex1 = input.nextInt();
        if (ex1 == 2)
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int ex2 = input.nextInt();
        if (ex2 == 1)
            System.out.println("Введите число");

        int ex3 = input.nextInt();

        System.out.println("Результат:");

        int metr = 1;
        System.out.println("Метры:" + ex3 * metr);

        double mil = 1609.34;
        double milrezult = ex3 / mil;
        String convertmil =  String.format("%.3f",milrezult);
        System.out.println("Мили:" + convertmil);

        double yard = 0.914;
        double yardrezult = ex3 / yard;
        String convertyard = String.format("%.2f",yardrezult);
        System.out.println("Ярды:" + convertyard);

        double ft = 0.3048;
        double ftrezult = ex3 / ft;
        String convertft = String.format("%.2f",ftrezult);
        System.out.println("Футы:" + convertft);
    }
}
