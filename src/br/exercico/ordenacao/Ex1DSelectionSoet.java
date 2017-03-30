/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.exercico.ordenacao;

/**
 *
 * @author aluno
 */
public class Ex1DSelectionSoet {
    public static void main(String[] args) {
        int vet[] = {2,4,6,8,10,1,3};
        int i;
        int aux, minimo;
        int compara = 0, troca = 0;
        
        
        System.out.print("Vetor desordenado vet[m] = ");
        for (int m = 0; m < vet.length; m++) {
            System.out.printf("[%d]",vet[m]);
        }
        System.out.println();
        
        //ordena os elementos do vetor
        for (i = 0; i <= vet.length-2; i++) {
            minimo = i;
            for (int j = i+1; j <= vet.length-1; j++) {
                if (vet[j] < vet[minimo]) {
                   minimo = j;
                }
                compara++;
            }
            aux = vet[i];
            vet[i] = vet[minimo];
            vet[minimo] = aux;
            troca++;
        }
        System.out.print("Vetor desordenado vet[m] = ");
        for (int m = 0; m < vet.length; m++) {
            System.out.printf("[%d]",vet[m]);
        }
        System.out.println();
        System.out.println("Comparação = "+compara);
        System.out.println("Troca = "+troca);
        System.out.println();
    }
}
