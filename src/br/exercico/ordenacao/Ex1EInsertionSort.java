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
public class Ex1EInsertionSort {
    public static void main(String[] args) {
        int vetE[] = {2,4,6,8,10,12,11,7,5,3,1};
        int i, aux;
        int troca = 0, compara = 0;
        
        //vetor desordenado 
        System.out.print("Vetor Desordenado vetE[j] = ");
        for (int j = 0; j < vetE.length; j++) {
            System.out.printf("[%d]",vetE[j]);
        }
        System.out.println();
        
        //Aqui vamos Ordenar o vetor
        for (int k = 1; k < vetE.length; k++) {
            aux = vetE[k];
            i = k - 1;
            
            while (i >= 0 && vetE[i] > aux) {                
                vetE[i+1] = vetE[i];
                i -= 1;
                compara++;
            }
            vetE[i + 1] = aux;
            troca++;
        }
        
        
        //vetor Ordenado
        System.out.print("Vetor Ordenado vetE[j] = ");
        for (int j = 0; j < vetE.length; j++) {
            System.out.printf("[%d]",vetE[j]);
        }
        System.out.println();
        System.out.println("Compração = "+compara);
        System.out.println("Troca = "+troca);
        
    }
}
