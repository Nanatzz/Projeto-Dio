package br.com.dio.exercícios.loops;

import java.util.Scanner;

public class Ex_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        int soma = 0;
        int media = 0;

        int count = 0;
        do {
            System.out.println("Nota: ");
            nota = scan.nextInt();

            media = media + nota;

            if (nota > soma) soma = nota;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior nota é: " + soma);
        System.out.println("Média das notas: " + (media/5));




        /*Exemplo de While para não esquecer

        while(nota < 0 || nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();
        }*/

    }
}
