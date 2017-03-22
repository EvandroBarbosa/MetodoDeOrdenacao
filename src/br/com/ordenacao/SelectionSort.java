/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordenacao;

import java.util.Random;

/**
 *
 * @author Evandro
 */
public class SelectionSort {
    public static void main(String[] args) {
        int selecao[] = new int[10];
        Random ale = new Random();
        int aux;
        int temp;
//        boolean verifica = true;
        //Aqui preenche o vetor de forma aleatoria
        System.out.print("Vetor desOrdenado vetor[i] = ");
        for (int i = 0; i < selecao.length; i++) {
            selecao[i] = ale.nextInt(100);
            System.out.printf("%d,",selecao[i]);
        }
        System.out.println("\n");
        
        //Aqui faz a Ordenação
        for (int i = 0; i <= selecao.length-2; i++) {
            aux = i;
            for (int j = i+1; j <= selecao.length-1; j++) {
                if (selecao[j] < selecao[aux]) {
                    aux = j;
                }
                
            }
               temp = selecao[i];
                selecao[i] = selecao[aux];
                selecao[aux] = temp;
        }
        
        System.out.print("Vetor Ordenado vetor[i]= ");
        //Aqui mostra o vetor Ordenado
        for (int i = 0; i < selecao.length; i++) {
            System.out.printf("%d,",selecao[i]);
        }
        System.out.println();
    }
}
