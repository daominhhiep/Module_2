package com.company;

public class Main {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 0; i < number; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int number) {
        boolean result = true;
        if (number < 2) {
            result = false;
        }
        for(int i = 2; (double)i <= Math.sqrt(number); ++ i) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}