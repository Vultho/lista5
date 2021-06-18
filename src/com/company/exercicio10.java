package com.company;


import java.util.Scanner;

public class exercicio10 {
    public static int jogo(int dado1, int dado2, int dadoSoma) {
        dadoSoma = dado1 + dado2;

        if (dadoSoma == 7 || dadoSoma == 11) {
            System.out.println("Voce ganhou");
            System.out.println("Resultado dado " + dadoSoma);
            if (dadoSoma == 2 || dadoSoma == 3 || dadoSoma == 12) {
                System.out.println("Voce perdeu");
                System.out.println("Resultado dado " + dadoSoma);
            }
        } else {
            int primeiraRodada = dadoSoma;
            System.out.println("Ponto");
            while (!(dadoSoma == 7)) {
                System.out.println("Digite qualquer Tecla para começar o jogo");
                Scanner scanner = new Scanner(System.in);
                String comecar2 = scanner.next();
                dadoSoma = (int) (Math.random() * (12 - 1)) + 2;
                System.out.println(dadoSoma);
                if (dadoSoma == 7) {
                    System.out.println("Você Perdeu");
                } else if (dadoSoma == primeiraRodada) {
                    System.out.println("Você ganhou, parabens");
                    break;
                }

            }

        }
        return dadoSoma;

    }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jogo craps!");
        System.out.println("Digite qualquer Tecla para começar o jogo");
        String começar = scanner.next();
        System.out.println("Lançando os dados ");
        int dadoSoma = 0;
        int dado1 = 1 + (int) ((Math.random() * 5) + 1);
        int dado2 = 1 + (int) ((Math.random() * 5) + 1);
        int resultadoDados;
        int soma = jogo(dado1, dado2,dadoSoma);
    }
// fazer dnv esa merda
}
