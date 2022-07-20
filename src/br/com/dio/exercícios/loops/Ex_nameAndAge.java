package br.com.dio.exercícios.loops;


import java.util.Scanner;

public class Ex_nameAndAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while(true) {
            System.out.println("Name: ");
            name = scan.next();
            if (name.equals("0"))
                break;

            System.out.println("Age: ");
            age = scan.nextInt();
        }

        System.out.println("Continua aqui....");
    }
}
