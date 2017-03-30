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
public class Ex1GInsertionSort {
    public static void main(String[] args) {
        int vetG[] = {8,9,7,3,4,2,6,1,5,10};
        int i;
        int chave;
        int compara = 0, troca = 0;
        
        //vetor desordenado
        System.out.print("Desordenado vetG[j] =");
        for (int j = 0; j < vetG.length; j++) {
        System.out.printf("[%d]",vetG[j]);
            
        }
        System.out.println();
        
        //ordenação
        for (int j = 1; j < vetG.length; j++) {
            chave = vetG[j];
            i = j - 1;
            
            while (i >= 0 && vetG[i] > chave) {                
                vetG[i+1] = vetG[i];
                i -= 1;
                compara++;
            }
            vetG[i+1] = chave;
            troca++;
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
