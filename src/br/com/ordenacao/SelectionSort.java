package br.com.ordenacao;

import java.util.Random;

/**
 *
 * @author Evandro
 */
public class SelectionSort {
    
    public static void main(String[] args) {
        int selecao[] = new int[20];
        Random ale = new Random();
        int aux;
        int temp;
//        boolean verifica = true;
        //Aqui preenche o vetor de forma aleatoria
        System.out.print("Vetor desOrdenado vetor[i] = ");
        for (int i = 0; i < selecao.length; i++) {
            selecao[i] = ale.nextInt(1000);
            System.out.printf("%d,",selecao[i]);
        }
        System.out.println("\n");
        
        //Aqui faz a Ordenação
        for (int i = 0; i <= selecao.length-2; i++) {
            aux = i;
            for (int j = i+1; j <= selecao.length-1; j++) {
                if (selecao[j] < selecao[aux]) {
                    aux = j;
                }
                
            }
               temp = selecao[i];
                selecao[i] = selecao[aux];
                selecao[aux] = temp;
        }
        
        System.out.print("Vetor Ordenado vetor[i]= ");
        //Aqui mostra o vetor Ordenado
        for (int i = 0; i < selecao.length; i++) {
            System.out.printf("%d,",selecao[i]);
        }
        System.out.println();
    }
}
