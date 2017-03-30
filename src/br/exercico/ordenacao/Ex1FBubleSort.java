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
public class Ex1FBubleSort {
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
        
        //Ordenando
        for (i = vetorF.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (vetorF[j-1] > vetorF[j]) {
                    aux = vetorF[j];
                    vetorF[j] = vetorF[j-1];
                    vetorF[j-1] = aux;
                    troca++;
                }
            }
                compara++;
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
