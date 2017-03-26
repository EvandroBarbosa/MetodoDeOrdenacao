/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.exercico.ordenacao;

/**
 *
 * @author Evandro
 */
public class Ex1CInsertionSort {
    public static void main(String[] args) {
        int ArrayC[] = {11,9,7,5,3,1,4,6,8,10};
        
        int compara = 0;//aqui conta quantas comparação foram feitas 
        int troc = 0;//aqui conta quantas trocas foram feitas
        int i, aux;//variavel de controle
        
        //mostra o vetor desordenado 
        System.out.print("vetor Desordeando ArrayC[mostra] = ");
        for (int mostra = 0; mostra < ArrayC.length; mostra++) {
            System.out.printf("[%d]",ArrayC[mostra]);
        }
        System.out.println("\n");
        
        //Aqui Ordena o elementos do vetor
        for (int j = 0; j < ArrayC.length; j++) {
            aux = ArrayC[j];
            i = j - 1;
            while(i >= 0 && ArrayC[i]>aux) {                
                ArrayC[i+1] = ArrayC[i];
                i -= 1;
                compara++;
            }
            ArrayC[i+1] = aux;
            troc++;
        } 
        
        //Aqui mostra o vetor Ordenado
        System.out.print("vetor Ordenado vetorC[j] = ");
         for (int mostra = 0; mostra < ArrayC.length; mostra++) {
            System.out.printf("[%d]",ArrayC[mostra]);
        }
        System.out.println("\n");
        //Aqui mostras as comparações e as trocas realizada na ordenação
        System.out.println("Comparações = "+compara);
        System.out.println("Trocas = "+troc+"\n");
        

    }
}
