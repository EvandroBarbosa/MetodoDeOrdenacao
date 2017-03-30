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
public class Ex1DInsertionSort {
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
        
        //Aqui onde ocorre a ordenação onde a magica acontece
        for (int j = 1; j < vet.length; j++) {
            aux = vet[j];
            i= j-1;
            while(i >= 0 &&  vet[i]>aux ) {
                vet[i+1] = vet[i];
                i-=1;
            compara++;
            }
            vet[i+1] = aux;
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
