package br.com.ordenacao;

import java.util.Random;

/**
 *
 * @author Evandro
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] element = new int[100];
        Random r = new Random();
        int chave;
        int i;
      
        System.out.print("Vetor Desordenado element[j]= ");
        //aqui mostra o vetor de element desordenado
        for (int j = 0; j < element.length; j++){
            element[j] = r.nextInt(1000);
            System.out.printf("[%d]",element[j]);
            if (j%10 == 0){ 
                System.out.println();
            }
        }
        System.out.println("\n");
        
        //Aqui faz a Ordenação
        for (int j = 1; j < element.length; j++) {
            chave = element[j];
            i= j-1;
            while(i >= 0 &&  element[i]>chave ) {
                element[i+1] = element[i];
                i-=1;
            }
            element[i+1] = chave;
        }
        
        System.out.print("Vetor Ordenado element[j]= ");
        //Aqui mostro já Ordenado
        for (int j = 0; j < element.length; j++)
            System.out.printf("[%d]",element[j]);
               
        System.out.println("\n");
    }
}
