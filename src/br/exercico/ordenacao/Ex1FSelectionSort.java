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
public class Ex1FSelectionSort {
    public static void main(String[] args) {
        int vetorF[] = {2,4,6,8,10,12,1,3,5,7,9,11};
        int i;
        int aux, minimo;
        int compara = 0, troca = 0;
        
        //Desordenado
        System.out.print("Desordenado vetorF[m]");
        for (int m = 0; m < vetorF.length; m++) {
            System.out.printf("[%d]",vetorF[m]);
        }
        System.out.println();
        
        //Ordenação
        for (i = 1; i <= vetorF.length-2; i++) {
            minimo = i;
            
            for (int j = i+1; j <= vetorF.length-1; j++) {
                
                if (vetorF[j] < vetorF[minimo]) {
                    minimo = j;
                }
                compara++;
            }
            aux = vetorF[i];
            vetorF[i] = vetorF[minimo];
            vetorF[minimo] = aux;
            troca++;
        }
        
        //Desordenado
        System.out.print("Desordenado vetorF[m]");
        for (int m = 0; m < vetorF.length; m++) {
            System.out.printf("[%d]",vetorF[m]);
        }
        System.out.println();
         //Aqui mostra a quantidade de conparação e troca que no processo de ordenação
        System.out.println("Comparações = "+compara);
        System.out.println("Trocas = "+troca+"\n");
    }
}
