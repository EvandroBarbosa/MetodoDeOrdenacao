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
public class Ex1HSelectionSort {
    public static void main(String[] args) {
         int vetorH[]= {89,79,32,38,46,26,43,38,32,79};
        int i, aux, temp;
        int troca = 0, compara = 0;
        
        System.out.print("Desordemado vetorH[j] = ");
        for (int j = 0; j < vetorH.length; j++) {
            System.out.printf("[%d]",vetorH[j]);
        }
        System.out.println();
        
        //Ordena
        for (i = 0; i <= vetorH.length-2; i++) {
            aux = i;
            for (int j = i+1; j <= vetorH.length-1; j++) {
                if (vetorH[j] < vetorH[aux]) {
                    aux = j;
                }
                compara++;
            }
               temp = vetorH[i];
                vetorH[i] = vetorH[aux];
                vetorH[aux] = temp;
                troca++;
        }
        
        System.out.print("Ordemado vetorH[j] = ");
        for (int j = 0; j < vetorH.length; j++) {
            System.out.printf("[%d]",vetorH[j]);
        }
        System.out.println();
        System.out.println("Comparação = "+compara);
        System.out.println("Troca = "+troca);
    }
}
