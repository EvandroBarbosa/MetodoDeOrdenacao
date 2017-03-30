
package br.exercico.ordenacao;

public class Ex1GSelectionSort {
    public static void main(String[] args) {
        int vetG[] = {8,9,7,3,4,2,6,1,5,10};
        int i, temp;
        int aux;
        int compara = 0, troca = 0;
        
        //vetor desordenado
        System.out.print("Desordenado vetG[j] =");
        for (int j = 0; j < vetG.length; j++) {
        System.out.printf("[%d]",vetG[j]);
            
        }
        System.out.println();
        
        
        //Ordenando
        for (i = 0; i <= vetG.length-2; i++) {
            aux = i;
            
            for (int j = i+1; j <= vetG.length-1; j++) {
                if (vetG[j] < vetG[aux]) {
                    aux = j;
                }
                compara++;
            }
            temp = vetG[i];
            vetG[i] = vetG[aux];
            vetG[aux] = temp;
            troca++;
        }
        
        
        //vetor desordenado
        System.out.print("Ordenado vetG[j] =");
        for (int j = 0; j < vetG.length; j++) {
        System.out.printf("[%d]",vetG[j]);
            
        }
        System.out.println();
         System.out.println("Comparação = "+compara);
        System.out.println("Troca = "+troca);
        System.out.println();
    }
}
