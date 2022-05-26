package desafio4;

import java.util.*;

import static java.lang.Math.abs;

/*Faça um programa que receba 3 números inteiros e retorne o maior entre
        eles seguido de "eh o maior". Use a seguinte fórmula:*/
public class Maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numerosInseriodos = scanner.nextLine().split(" ");
        int maior = maiorNumero(Integer.parseInt(numerosInseriodos[0]), Integer.parseInt(numerosInseriodos[1]));
        int maiorDeTodos = maiorNumero(maior, Integer.parseInt(numerosInseriodos[2]));

        System.out.println(maiorDeTodos + " eh o maior");
    }

    public static int maiorNumero(int a, int b) {
        return (a + b + abs(a - b)) / 2;
    }
}