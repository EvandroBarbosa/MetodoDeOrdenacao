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
public class Ex1GBubleSort {
    public static void main(String[] args) {
        int vetG[] = {8,9,7,3,4,2,6,1,5,10};
        int i;
        int aux;
        int compara = 0, troca = 0;
        
        //vetor desordenado
        System.out.print("Desordenado vetG[j] =");
        for (int j = 0; j < vetG.length; j++) {
        System.out.printf("[%d]",vetG[j]);
            
        }
        System.out.println();
        
        //ordenação
        for (i = vetG.length; i >= 1; i--) {
            compara++;
            for (int j = 1; j < i; j++) {
                if(vetG[j-1] > vetG[j]) {                    
                    aux = vetG[j];
                    vetG[j] = vetG[j-1];
                    vetG[j-1] = aux;
                    troca++;
                }
            }
        }
        
        
        
        //vetor desordenado
        System.out.print("Ordenado vetG[j] =");
        for (int j = 0; j < vetG.length; j++) {
        System.out.printf("[%d]",vetG[j]);
            
        }
        System.out.println();
         System.out.println("Comparação = "+compara);
        System.out.println("Troca = "+troca);
        System.out.println();
    }
}
