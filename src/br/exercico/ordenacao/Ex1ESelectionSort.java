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
public class Ex1ESelectionSort {
    public static void main(String[] args) {
         int vetE[] = {2,4,6,8,10,12,11,7,5,3,1};
        int aux, temporario;
        int troca = 0, compara = 0;
        
        //vetor desordenado 
        System.out.print("Vetor Desordenado vetE[j] = ");
        for (int j = 0; j < vetE.length; j++) {
            System.out.printf("[%d]",vetE[j]);
        }
        System.out.println();
        
        boolean verifica = false;
        //Ordenação
        for (int i = 0; i <= vetE.length-2; i++) {
            aux = i;
            verifica = false;
            for (int j = i + 1; j <= vetE.length-1; j++) {
                if (vetE[j] < vetE[aux]) {
                    aux = j;
                    verifica = true;
                }
                    compara++;
            }
            temporario = vetE[i];
            vetE[i] = vetE[aux];
            vetE[aux] = temporario;
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
