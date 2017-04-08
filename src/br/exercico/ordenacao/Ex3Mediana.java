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
 * @author Evandro
 */
public class Ex3Mediana {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        int valor = 0;
        int l, aux;
        float mediana = 0;
        Scanner entrada = new Scanner(System.in);
        
        //aqui ele vai preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
//            System.out.println("Digite valores inteiros até preencher o vetor");
            vetor[i] = entrada.nextInt();           
        }
       
        Ordenacao.bubleSort(vetor);
        Ordenacao.insertionSort(vetor);
        Ordenacao.selectionSort(vetor);
           
//        System.out.print("vetor =  ");
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.printf(" %d ",vetor[i]);
//        }
        int div = vetor.length-1;
        int esq =0;
        valor = (esq+div)/2;
        mediana = vetor[valor];
        
        System.out.println();
        System.out.println("Mediana = "+mediana);
    }
}