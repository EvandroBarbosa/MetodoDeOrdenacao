/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.exercico.ordenacao;

/**
 *
 * @author Evandro
 */
public class Ex1CSelectionSort {
    public static void main(String[] args) {
         int ArrayC[] = {11,9,7,5,3,1};
        
        int compara = 0;//aqui conta quantas comparação foram feitas 
        int troc = 0;//aqui conta quantas trocas foram feitas
        int i, aux, minimo;//variavel de controle
        
        //mostra o vetor desordenado 
        System.out.print("vetor Desordeando ArrayC[mostra] = ");
        for (int mostra = 0; mostra < ArrayC.length; mostra++) {
            System.out.printf("[%d]",ArrayC[mostra]);
        }
        System.out.println("\n");
        
        //Aqui ordena os elementos do vetor
        for (i = 0; i <= ArrayC.length-2; i++) {
            minimo = i;
            for (int j = i+1; j <= ArrayC.length-1; j++) {
                if (ArrayC[j] < ArrayC[minimo]) {
                   minimo = j;
                }
                compara++;
            }
            aux = ArrayC[i];
            ArrayC[i] = ArrayC[minimo];
            ArrayC[minimo] = aux;
            troc++;
        }
        
        //Aqui mostra o vetor Ordenado
        System.out.print("vetor Desordenado vetorC[mostra] = ");
        for (int mostra = 0; mostra < ArrayC.length; mostra++) {
            System.out.printf("[%d]",ArrayC[mostra]);
        }
        System.out.println("\n");
        //Aqui mostra a quantidade de conparação e troca que no processo de ordenação
        System.out.println("Comparações = "+compara);
        System.out.println("Trocas = "+troc+"\n");

    }
}
