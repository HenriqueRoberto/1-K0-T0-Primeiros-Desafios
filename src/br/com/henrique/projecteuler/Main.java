package br.com.henrique.projecteuler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner teclado = new Scanner(System.in);

            System.out.println("===== Menu =====");
            System.out.println("1 - Multiple of 3 or 5");
            System.out.println("2 - Even Fibonacci Numbers");
            System.out.println("3 - Largest Prime Factor");
            System.out.println("0 - Exit");
            System.out.println("Enter a number from the menu:");


            int n = teclado.nextInt();
            if (n == 1){
                Multiple3or5 m = new Multiple3or5();
                m.execute();
            } else if (n == 2) {
                FibonacciPair f = new FibonacciPair();
                f.execute();
            } else if (n == 3) {
                LargestPrime l = new LargestPrime();
                l.execute();

            }else if(n == 0){
                break;
            } else {
                System.out.println("This number is not in the menu.");
            }


        }


    }
}