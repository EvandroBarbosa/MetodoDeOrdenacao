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
public class Ex1DBubleSort {
    public static void main(String[] args) {
         int vet[] = {2,4,6,8,10,1,3};
        int i;
        int aux;
        int compara = 0, troca = 0;
        
        
        System.out.print("Vetor desordenado vet[m] = ");
        for (int m = 0; m < vet.length; m++) {
            System.out.printf("[%d]",vet[m]);
        }
        System.out.println();
                
        //Ordena os elementos do vetor
        for (i = vet.length; i>=1; i--) {
            compara++;
            for (int j = 1; j < i; j++) {
                
                if(vet[j - 1] > vet[j]) {
                    aux = vet[j];
                    vet[j] = vet[j - 1];
                    vet[j - 1] = aux;
                    
                    troca++;
                }
            }
        }
        System.out.print("Vetor Ordenado vet[m] = ");
        for (int m = 0; m < vet.length; m++) {
            System.out.printf("[%d]",vet[m]);
        }
        System.out.println();
        System.out.println("Comparação = "+compara);
        System.out.println("Troca = "+troca);
        System.out.println();
    }
}
