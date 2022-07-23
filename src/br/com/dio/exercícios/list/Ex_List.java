package br.com.dio.exercícios.list;

import java.util.*;

public class Ex_List {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione cinco notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(3.0);
        notas.add(5.5);
        notas.add(7.9);
        notas.add(6.0);
        notas.add(10.0);
        System.out.println(notas);

        /*System.out.println("Exiba a posição da nota 6.0: " + notas.indexOf(6d));

        System.out.println("Adicione na lista a nota 3.0 na posição 2: ");
        notas.add(2, 3d);
        System.out.println(notas);

        System.out.println("Substitua a nota 3.0 pela nota 4.5: ");
        notas.set(notas.indexOf(3d), 4.5);
        System.out.println(notas);

        System.out.println("Confira se a nota 7.9 está na lista: " + notas.contains(7.9d));*/

        /*System.out.println("Exiba as notas na ordem que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);*/

        /*System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());*/

        /*System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));*/

        /*Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba o resultado da soma: " + soma);

        System.out.println("Exiba a média das notas:" + (soma/notas.size()));

        System.out.println("Remova a nota 3.0: ");
        notas.remove(3d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 1: ");
        notas.remove(1);
        System.out.println(notas);*/

        /*System.out.println("Remova as notas menores que 7.0: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);*/

        /*System.out.println("Apague a lista de notas");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());*/
    }
}
