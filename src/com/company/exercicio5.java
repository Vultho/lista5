package com.company;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        System.out.println("Digite o valor do produto?");
        Scanner myObj = new Scanner(System.in);
        float valorProduto = myObj.nextFloat();
        System.out.println("Digite a taxa do produto");
        float taxaProduto = myObj.nextFloat();
        float valorTaxa = somaImposto(taxaProduto, valorProduto);
        float valorFinalProduto = alterar(valorTaxa, valorProduto);
        System.out.println("Valor final do produto: R$" + valorFinalProduto);
    }

    public static float somaImposto(float taxaImposto, float custoProduto) {
        return custoProduto * (taxaImposto / 100);
    }

    public static float alterar(float valorTaxaProduto, float custoProduto) {
        return valorTaxaProduto + custoProduto;
    }
}
