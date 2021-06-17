package com.company;

import java.util.Scanner;

public class exercicio3 {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Primeiro numero");
        float primeiroNumero = myObj.nextFloat();
        System.out.println("Segundo numero");
        float segundoNumero = myObj.nextFloat();
        System.out.println("Terceiro numero");
        float terceiroNumero = myObj.nextFloat();
        System.out.println("Soma dos numeros "+somaNumeros(primeiroNumero,segundoNumero,terceiroNumero));
    }
    public static float somaNumeros(float primeiroNumero, float segundoNumero, float terceiroNumero ){
        return (primeiroNumero + segundoNumero + terceiroNumero);

    }

    }
