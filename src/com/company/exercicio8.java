package com.company;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        System.out.println("Digite o numero");
        int numero;
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        String contar = String.valueOf(numero);

        System.out.println(contar.length());




    }
}