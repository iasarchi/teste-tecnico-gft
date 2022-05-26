package desafio2;

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o turno que você trabalha: M - matutino | V - vespetino | N - noturno: ");
        char turno = scanner.next().charAt(0);
        switch (turno) {
            case 'M' -> {
                System.out.println("Bom dia!");
            }
            case 'V' -> {
                System.out.println("Boa Tarde");
            }

            case 'N' -> System.out.println("Boa noite");
            default -> System.out.println("Valor inválido");
        }
    }

    }





