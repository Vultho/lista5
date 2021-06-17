package com.company;

import java.util.Scanner;

public class exercicio2 {
    public static void repetiçoes(int numeroRepete){
        for(int i = 0 ; i< numeroRepete; i++){
            for( int j = 0; j < (i+1); j++){
                System.out.print((j+1) + "  ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o numero de repetiçoes");
        int numerorepetiçao = num.nextInt();
        repetiçoes(numerorepetiçao);
    }
}