package com.company;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        String numeroiInteiero = String.valueOf(scanner.nextInt());
        String[] digitosSeparados = numeroiInteiero.split("");
        for (int i = (digitosSeparados.length-1); i>=0; i--){
            System.out.print( digitosSeparados[i]);
        }


    }
}
