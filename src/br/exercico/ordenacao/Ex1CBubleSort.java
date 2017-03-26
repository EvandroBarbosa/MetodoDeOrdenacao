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
public class Ex1CBubleSort {
    public static void main(String[] args) {
        int ArrayC[] = {11,9,7,5,3,1};
        
        int compara = 0;//aqui conta quantas comparação foram feitas 
        int troc = 0;//aqui conta quantas trocas foram feitas
        int i, aux;//variavel de controle
        
        //mostra o vetor desordenado 
        System.out.print("vetor Desordeando ArrayC[mostra] = ");
        for (int mostra = 0; mostra < ArrayC.length; mostra++) {
            System.out.printf("[%d]",ArrayC[mostra]);
        }
        System.out.println("\n");
              
        //Aqui que será ordenado o vetor
        for (i = ArrayC.length; i >= 1; i--) {
            compara++;            
            for (int j = 1; j < i; j++) {
                if (ArrayC[j-1]> ArrayC[j]) {
                    aux = ArrayC[j];
                    ArrayC[j] = ArrayC[j-1];
                    ArrayC[j-1] = aux;
                    troc++;
                   
                }
            }                        
        }        
        
        //mostra o vetor Ordenado 
        System.out.print("vetor Ordeando ArrayC[mostra] = ");
        for (int mostra = 0; mostra < ArrayC.length; mostra++) {
            System.out.printf("[%d]",ArrayC[mostra]);
        }
        System.out.println("\n");
        System.out.println("Comparações = "+compara);
        System.out.println("Trocas = "+troc+"\n");
        
        
        
    }
}
