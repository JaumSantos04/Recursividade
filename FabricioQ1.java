package Recursividade;

import java.util.Scanner;

public class FabricioQ1 {
    public static void main(String[] args) {
        System.out.println("Qual o número que você quer realizar a soma recursiva?");
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int n = sc.nextInt();

        System.out.println(somaR(n,soma));
    }

    private static int somaR(int n, int soma) {
        if (n == 0){
            
            return soma;

        }else{          
            soma += n;
            n--;
            return somaR(n, soma);
        }
    }
}