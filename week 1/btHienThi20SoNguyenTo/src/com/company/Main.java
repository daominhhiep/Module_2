package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can hien: ");
        int number = scan.nextInt();
        showPrime(number);
    }

    public static boolean isPrime(int number) {
        boolean result = true;
        if (number < 2) {
            result = false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void showPrime(int number) {
        int count = 0;
        int i = 0;
        while (count < number) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
}
