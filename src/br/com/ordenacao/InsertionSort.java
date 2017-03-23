/*
 *Esse codigo não esta funcionando é preciso fazer algumas correções 
 */
package br.com.ordenacao;

/**
 *
 * @author Evandro
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] element = {39,14,52,65,7,1,5,6,4};
        int chave;
        int i;
        
        System.out.print("Vetor Desordenado element[j]= ");
        //aqui mostra o vetor de element desordenado
        for (int j = 0; j < element.length; j++)
            System.out.printf("[%d],",element[j]);
        
        System.out.println("\n");
        
        //Aqui faz a Ordenação
        for (i = 0; i < element.length; i++) {
            chave = element[i];
            for (int j = i-1; j >= 0 && chave < element[j]; j--) {
                element[j+1] = element[j];
                
            }
            element[i+1] = chave;
        }
        
        System.out.print("Vetor Ordenado element[j]= ");
        //Aqui mostro já Ordenado
        for (int j = 0; j < element.length; j++)
            System.out.printf("[%d],",element[j]);
               
        System.out.println("\n");
    }
}
