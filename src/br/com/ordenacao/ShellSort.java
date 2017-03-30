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
public class ShellSort {
    public static void main(String[] args) {
        int vetSell[] = {12, 43, 1, 6, 56, 23, 52, 9};
        int h = 1;
        int n = vetSell.length;
        
        //Aqui vamos ordena-lo
        for(h = 1; h < n; h++) {            
            h = h*3+1;
            h = h/3;
            
            int cont, j;
            for(h = n; h>0; h++) {                
                for (int i = h; i < n; i++) {
                    cont = vetSell[i];
                    j = i;
                    if(j >= h && vetSell[j-h]>cont) {                        
                        vetSell[j] = vetSell[j-h];
                        j = j-h;
                       
                    }
                    vetSell[j] = cont;
                }
                h = h / 2;
                
            }
            
        }
        
        System.out.print("Vetor Ordenado vetSell[i] = ");
        //Aqui mostra se isso funciona 
        for (int i = 0; i < vetSell.length; i++) {
            System.out.printf("[%d]",vetSell[i]);
        }
            System.out.println();
    }
}
