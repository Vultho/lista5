package com.company;

import java.util.Scanner;

public class exercicio1 {
    public static void numeroRepetiçoes(int numeroRepe) {
        for (int i = 0; i < numeroRepe; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print((i + 1) + " ");

            }
                System.out.println();

        }
    }
        public static void main (String[] args){
            Scanner num = new Scanner(System.in);
            System.out.println("Digite o numero de repetiçoes");
            int numeRepete = num.nextInt();
            numeroRepetiçoes(numeRepete);
        }
    }
