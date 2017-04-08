/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.exercico.ordenacao;

import br.com.ordenacao.Ordenacao;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Ex5 {

   
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        String frase;
        String dados = "";
        int vetor[] = new int[255];
        int freq[] =new int[255]; 
        System.out.println("Digite uma frase");
        frase = digite.nextLine();
        
        //trabalha o com os carater separados
        for (int i = 0; i < frase.length(); i++) {
            vetor[frase.charAt(i)]++;
        }
        
        //ordenando o vetor
        insertion(vetor, freq);
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                
                char l = (char) freq[i];
                dados += (" "+l+"= "+vetor[i]);
                
            }
        }
        System.out.print("Frase = "+frase+" "+dados);
        System.out.println();
    }
    
    //metodo para ordenação
    public static void insertion(int[] vetor, int[] freq){
        int vet[] = vetor;
        int i;
        int chave;
        for (int j = 1; j < vet.length; j++) {
            chave = vet[j];
            int chav = j;
            i= j-1;
            while(i >= 0 &&  vet[i] > 0) {
                vet[i+1] = vet[i];
                freq[i+1] = freq[i];
                i-=1;
            }
            vet[i+1] = chave;
            freq[i+1] = chav;
        }
    }
}
