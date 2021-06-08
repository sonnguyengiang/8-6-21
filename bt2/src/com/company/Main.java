package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = scanner.nextInt();
        int count=0;
        int status = 1;
        int num = 3;

        System.out.println(2);
        for ( int i = 2 ; i <= number;  ) {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                i++;
                count++;
            }
            status = 1;
            num++;
        }
    }
}