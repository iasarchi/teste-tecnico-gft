package desafio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*1. Crie uma classe Pessoa com os seguintes atributos: Nome, Gênero (Masculino
ou Feminino), Cor dos Olhos (Castanho, Verde, Azul), Cor do Cabelo (Castanho,
Loiro, Ruivo), Data de nascimento, tipo sanguíneo (A,B,AB,O), fator RH (+,-);
depois
• crie um método que receba um ano e retorne a idade que a Pessoa em
questão fará no ano recebido.
• crie um método da classe que receba duas pessoas de gêneros
diferentes e uma cor para os olhos do bebê, retorne a probabilidade
de cor dos olhos do bebê, caso essas pessoas viessem a ter um(a)
filho(a), de acordo com a tabela abaixo : (Vale 3 pontos)*/
public class Pessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
         String nome;
         char genero;
         String corDosOlhos;
         String corDoCabelo;
         LocalDate dataDeNascimento;
         String tipoSanguineo;
         char fatorRH;
    }

    public int idade(int ano) {
        return ano - dataDeNascimento.getYear();
    }



}

