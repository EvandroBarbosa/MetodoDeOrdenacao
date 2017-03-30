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
public class Ex1HInsertionSort {
    public static void main(String[] args) {
        int vetorH[]= {89,79,32,38,46,26,43,38,32,79};
        int i, aux;
        int troca = 0, compara = 0;
        
        System.out.print("Desordemado vetorH[j] = ");
        for (int j = 0; j < vetorH.length; j++) {
            System.out.printf("[%d]",vetorH[j]);
        }
        System.out.println();
        
        //Ordenando
        for (int j = 1; j < vetorH.length; j++) {
            aux = vetorH[j];
            i= j-1;
            while(i >= 0 &&  vetorH[i]>aux ) {
                vetorH[i+1] = vetorH[i];
                i-=1;
                compara++;
            }
            vetorH[i+1] = aux;
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
