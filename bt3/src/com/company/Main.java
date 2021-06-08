package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("nhung so nguyen to nho hon 100 la: ");
        int check = 1;
        int num = 2;
        for (int i = 2; i <= 100; ) {
            for (int j = 2; j < Math.sqrt(num); j++) {
                if (num%j == 0) {
                    check = 0;
                    break;
                }
            } if (check != 0) {
                System.out.println(num);
                i++;
            }
            check = 1;
            num++;
           if (num > 100) {
             break;
           }
        }
    }
}
