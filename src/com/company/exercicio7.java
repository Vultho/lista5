package com.company;

import java.util.Scanner;

public class exercicio7 {
    public static float valorPagamneto(float valorDaPrestaocao, float numerosDeDiasAtraso) {
        if (numerosDeDiasAtraso > 0) {
            float multa = (3f / 100) * valorDaPrestaocao;
            float diasAcumulaods = (0.1f / 100) + numerosDeDiasAtraso;
            float totalmulta = multa + diasAcumulaods;
            float valorNovo = valorDaPrestaocao + totalmulta;
            System.out.println("Valor a ser pago " + valorNovo);
        } else if (numerosDeDiasAtraso == 0) {
            System.out.println("O valor a ser pago é " + valorDaPrestaocao);

        }

        return valorDaPrestaocao;
    }

    public static float[] outrasPrestacoes(float[] prestacoesAmais, float verificando, int parcelas) {
        if (verificando == 2) {
            System.out.println("finalizando programa...");
        } else if (verificando == 1) {
            System.out.println("Quantas parcelas amais?");
            Scanner scanner1 = new Scanner(System.in);
            parcelas = scanner1.nextInt();
            for (int i = 0; i < parcelas; i++) {
                System.out.println("Digite o valor das demais Prestacoes: ");
                Scanner scanner = new Scanner(System.in);
                prestacoesAmais[i] = scanner.nextFloat();
            }
            for(int i= 0; i < parcelas; i++) {
                do {
                    float total;
                    float multa;
                    multa = (3f / 100) * prestacoesAmais[i];
                    total = prestacoesAmais[i] + multa;
                    System.out.println("o valor da prestacao final é " + prestacoesAmais[i]);
                }while (parcelas == 0);
            }
        }
        return prestacoesAmais;
    }



    public static void main(String[] args) {
        int parcelas = 0;
        float[] prestacoesAmais = new float[10];
        System.out.println("Digite o valor da prestacao");
        Scanner scanner = new Scanner(System.in);
        float valorDaPrestacao = scanner.nextInt();
        System.out.println("Digite os dias de atraso");
        float numerosDeDiasAtraso = scanner.nextInt();
        float teste = valorPagamneto(valorDaPrestacao, numerosDeDiasAtraso);
        System.out.println("Deseja adicionar mais prestacoes? (1- Sim, 2- Nao)");
        float verificando = scanner.nextFloat();
        float[] teste2 = outrasPrestacoes(prestacoesAmais, verificando,parcelas);
        System.out.println("Relatorio do dia");
        float valorTotal = prestacoesAmais[0]+prestacoesAmais[1]+prestacoesAmais[2]+prestacoesAmais[3]+prestacoesAmais[4]+prestacoesAmais[5]+prestacoesAmais[6]+prestacoesAmais[7]+prestacoesAmais[8] +prestacoesAmais[9] + valorDaPrestacao;
        String relatorio = "foram pagas " + (parcelas) + "No total foi pago " + (valorTotal);
        System.out.println(relatorio);



    }
}
