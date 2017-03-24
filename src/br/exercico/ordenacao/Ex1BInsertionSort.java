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
public class Ex1BInsertionSort {
    public static void main(String[] args) {
        int vetorB[] = {2,4,6,8,12,1,3,7,5};
        
        int i;//variavel cotatdora
        int chave;//variaveis auxiliar
        int comp =0, troca = 0;
        //Aqui mostra o vetor desordenado
        System.out.print("vetor Desordenado vetorB[j]=");
        for (int j = 0; j < vetorB.length; j++) {
            System.out.printf("[%d]",vetorB[j]);
            
        }
        System.out.println();
        
        
        //Aqui onde ocorre a ordenação onde a magica acontece
        for (int j = 1; j < vetorB.length; j++) {
            chave = vetorB[j];
            i= j-1;
            while(i >= 0 &&  vetorB[i]>chave ) {
                vetorB[i+1] = vetorB[i];
                i-=1;
            comp++;
            }
            vetorB[i+1] = chave;
            troca++;
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
