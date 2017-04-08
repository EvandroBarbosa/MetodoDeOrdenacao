/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.exercico.ordenacao;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Ex2Bingo {
    public static int index = 0;
    public static void main(String[] args) {
        char opcao = '1';
        int numero[] = new int[20];

        

        System.out.println("Bem vindo ao Bingo");

        while (opcao == '1') {
            int sortiado;

            // verifica se o numero já foi sorteado 
            do {
                sortiado = (int)( Math.random()*90);
            } while (naoRepetir(sortiado, numero));

            numero[index] = sortiado;

            // orderna o vetor
            ordernar(numero);

            String texto = " ";

            for (int i = 0; i <= index; i++) {
                texto += numero[i] + " ";
            }

            System.out.println("\n Os Numeros Sorteados São: \n" + texto);
            
            Scanner entrada = new Scanner(System.in);
            String teclado;
            do {
                System.out.println("\n Digite 1 para continuar o sorteio \n"
                        + "$ para sair do sorteio ");
                teclado = entrada.next();
            } while (teclado.charAt(0) != '1' && teclado.charAt(0) != '$');

            opcao = teclado.charAt(0);

            index++;
        }
    }

    private static boolean naoRepetir(int sortiado, int numero[]) {
        // verifica se o numero é repetido no vetor.
        for (int i = 0; i <= index; i++) {
            if (numero[i] == sortiado) {
                return true;
            }
        }

        return false;
    }

    private static void ordernar(int[] numero) {

        for (int j = 1; j <= index; j++) {
            int i, aux;
            aux = numero[j];
            i = j - 1;

            while (i >= 0 && numero[i] > aux) {
                numero[i + 1] = numero[i];
                i = i - 1;
            }

            numero[i + 1] = aux;
        }

    }
}
