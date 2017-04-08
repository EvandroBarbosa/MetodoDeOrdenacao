/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordenacao;

/**
 *
 * @author Evandro
 */
public class Ordenacao {
    //Essa classe terá os metodos de ordenação
    //para facilitar na resolução dos exercicio
    
    //Esso é o metodo de ordenação chamado de bolha
    public static void bubleSort(int[] bolha){
        int i, aux;
        for (i = bolha.length; i>=1; i--) {
            for (int j = 1; j < i; j++) {
                if(bolha[j - 1] > bolha[j]) {
                    aux = bolha[j];
                    bolha[j] = bolha[j - 1];
                    bolha[j - 1] = aux;

                }
            }
        }
    }
    
    //Esse é o metodo de ordenação por inserção
    public static void insertionSort(int[] vetor){
        int i, chave;
        for (int j = 1; j < vetor.length; j++) {
            chave = vetor[j];
            i= j-1;
            while(i >= 0 &&  vetor[i]>chave ) {
                vetor[i+1] = vetor[i];
                i-=1;
            }
            vetor[i+1] = chave;
        }
    }
    
    //esse é o metodo de ordenação por seleção
    public static void selectionSort(int[] array){
        int aux, temp;
        for (int i = 0; i <= array.length-2; i++) {
            aux = i;
            for (int j = i+1; j <= array.length-1; j++) {
                if (array[j] < array[aux]) {
                    aux = j;
                }                
            }
               temp = array[i];
                array[i] = array[aux];
                array[aux] = temp;
        }
    }

    
}
