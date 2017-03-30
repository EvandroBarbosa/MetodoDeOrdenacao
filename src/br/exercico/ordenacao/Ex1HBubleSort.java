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
public class Ex1HBubleSort {
    public static void main(String[] args) {
        int vetorH[]= {89,79,32,38,46,26,43,38,32,79};
        int i, aux;
        int troca = 0, compara = 0;
        
        System.out.print("Desordemado vetorH[j] = ");
        for (int j = 0; j < vetorH.length; j++) {
            System.out.printf("[%d]",vetorH[j]);
        }
        System.out.println();
        
        //Ordena
        for (i = vetorH.length; i >= 1; i--) {
            compara++;
            for (int j = 1; j < i; j++) {
                if (vetorH[j-1] > vetorH[j]) {
                    aux = vetorH[j];
                    vetorH[j] = vetorH[j-1];
                    vetorH[j-1] = aux;
                    troca++;
                }
            }
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
