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
public class Ex1BBubleSort {
    public static void main(String[] args) {
        int vetorB[] = {2,4,6,8,12,3,1};
        int i;//variavel cotatdora
        int chave;//variaveis auxiliar
        int comp =0, troca = 0;
        //Aqui mostra o vetor desordenado
        System.out.print("vetor Desordenado vetorB[j]=");
        for (int j = 0; j < vetorB.length; j++) {
            System.out.printf("[%d]",vetorB[j]);
            
        }
        System.out.println();
        
        //Aqui que será ordenado o vetor
        
        for (i = vetorB.length; i>=1; i--) {
            comp++;
            for (int j = 1; j < i; j++) {
                if(vetorB[j - 1] > vetorB[j]) {
                    chave = vetorB[j];
                    vetorB[j] = vetorB[j - 1];
                    vetorB[j - 1] = chave;
                    troca++;
                }
            }
        }
        
        
        
         //Aqui mostra a quantidade de comparação 
        System.out.println("Comparação = "+comp);
        System.out.println("Troca = "+troca);
        System.out.print("vetor Ordenado vetorB[j]=");
        for (int j = 0; j < vetorB.length; j++) {
            System.out.printf("[%d]",vetorB[j]);
        }
        System.out.println();
        
    }
}
