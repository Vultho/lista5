package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class exercicio6 {
    public static String conversao(String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date date3 = sdf.parse(time);
        SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm aa");
        System.out.println("Horas em Pm/Am " + sdf2.format(date3));

        return time;
    }

    public static void main(String[] args) throws ParseException {
        int op;
        do {
            System.out.println("Digite as horas em formato 24H");
            Scanner scanner = new Scanner(System.in);
            String time = scanner.next();
            String teste = conversao(time);
            System.out.println("Deseja colocar outro horario (1-Sim 2-Nao)");
            op = scanner.nextInt();

        }
        while(op == 1);
    }
}



