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
public class Ex1EBubleSort {
    public static void main(String[] args) {
        int bolha[] = {2,4,6,8,10,12,11,7,5,3,1};
        int i, aux;
        int troca = 0, compara = 0;
        
        //vetor desordenado 
        System.out.print("Vetor Desordenado bolha[j] = ");
        for (int j = 0; j < bolha.length; j++) {
            System.out.printf("[%d]",bolha[j]);
        }
        System.out.println();
        
        //Aqui vamos ordenar o elementos do vetor
        for (i = bolha.length; i >= 1; i--) {
            compara++;
            for (int j = 1; j < i; j++) {
                if (bolha[j-1] > bolha[j]) {
                    aux = bolha[j];
                    bolha[j] = bolha[j-1];
                    bolha[j-1] = aux;
                    
                    troca++;
                }
            }
        }
        
        //vetor desordenado 
        System.out.print("Vetor Ordenado bolha[j] = ");
        for (int j = 0; j < bolha.length; j++) {
            System.out.printf("[%d]",bolha[j]);
        }
        System.out.println();
        System.out.println("Compração = "+compara);
        System.out.println("Troca = "+troca);
    }
}
