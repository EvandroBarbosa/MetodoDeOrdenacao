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
public class Exer1BSelectionSort {
    public static void main(String[] args) {
        int vetorB[] = {2,4,6,8,12,1,5,5,6,9};
        int i;//variavel cotatdora
        int min, aux;//variaveis auxiliar
        int cont =0, troca = 0;
        //Aqui mostra o vetor desordenado
        System.out.print("vetor Desordenado vetorB[j]= ");
        for (int j = 0; j < vetorB.length; j++) {
            System.out.printf(" [%d] ",vetorB[j]);
            
        }
        System.out.println();
        
        //Aqui vamos ordenar o vetorB mais como ele ja esta ordenado so vai fazer as comparçoes
        for (i = 0; i <= vetorB.length-2; i++) {
            min = i;
            for (int l = i+1; l <= vetorB.length-1; l++) {
                
                if (vetorB[l] < vetorB[min]) {
                    min = l;
                }
                    cont++;
            }
                aux = vetorB[i];
                vetorB[i] = vetorB[min];
                vetorB[min] = aux;
                    troca++;
        }
        //mostra ja ordenado
        System.out.print("vetor Ordenado vetorB[j]= ");
        for (int j = 0; j < vetorB.length; j++) {
            System.out.printf(" [%d] ",vetorB[j]);
        }
        System.out.println();
        //Aqui mostra a quantidade de comparação 
        System.out.println("Comparação = "+cont);
        System.out.println("Troca = "+troca);
        
    }
}
