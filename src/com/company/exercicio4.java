package com.company;

import java.util.Scanner;

public class exercicio4 {
    public static float positivoOuNegativo(float numeroDigitado) {
        if (numeroDigitado > 0) {
             String positivo = "Positivo";
             System.out.println( positivo);
        }
        if (numeroDigitado < 0) {
             String negativo = "Negativo";
            System.out.println( negativo);

        } else if (numeroDigitado == 0) {
             String zero = "= 0";
            System.out.println( zero);

        }
        return numeroDigitado;
    }

    public static void main(String[] args) {
        float numeroDigitado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero");
        numeroDigitado = scanner.nextFloat();
        float x = positivoOuNegativo(numeroDigitado);
        System.out.println(x);




    }
}
