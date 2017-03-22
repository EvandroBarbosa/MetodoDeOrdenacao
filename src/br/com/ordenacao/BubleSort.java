/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordenacao;

import static javax.management.Query.gt;
import static javax.management.Query.lt;

/**
 *
 * @author Evandro
 */
public class BubleSort {

    public static void main(String[] args) {

        int[] vet = {8, 19, 31, 25, 1};
        int aux = 0;
        int i = 0;

        System.out.print("Vetor Desordenado vet[i] = ");
        for (i = 0; i<vet.length; i++) 
            System.out.printf("[%d],",  vet[i]);
        
        System.out.println("\n");

        for (i = vet.length; i>=1; i--) {
            for (int j = 1; j < i; j++) {
                if(vet[j - 1] > vet[j]) {
                    aux = vet[j];
                    vet[j] = vet[j - 1];
                    vet[j - 1] = aux;

                }
            }
        }
        System.out.print("Vetor Ordenado vet[i] = ");
        for (i = 0; i < vet.length; i++) 
            System.out.printf("[%d],",vet[i]);
        System.out.println("");
    }
}
