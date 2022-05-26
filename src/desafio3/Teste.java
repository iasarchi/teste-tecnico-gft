package desafio3;

import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Receita carneCozida = new Receita("Carne cozida",
                Collections.singletonList(new Ingrediente("Carne", 1)),
                10,
                "Cozinhar a carne");

        Receita churrasco = new Receita("Churrasco de maminha",
                Collections.singletonList(new Ingrediente("Carne", 1)),
                20,
                "Cozinha a carne por 30min e tá pronto");

        Receita ovoMexido = new Receita("Ovo mexino",
                Collections.singletonList(new Ingrediente("Ovo", 1)),
                2,
                "Coloca o ovo na frigideira e mexe");

        Map<Ingrediente, List<Receita>> receitaPorIngrediente = new HashMap<>();

        receitaPorIngrediente.put(new Ingrediente("Carne", 1), List.of(carneCozida, churrasco));
        receitaPorIngrediente.put(new Ingrediente("Ovo", 1), List.of(ovoMexido));


        System.out.println("Digite o ingrediente");
        String nomeIngrediente = scanner.nextLine();

        System.out.println("Digite a quantidade de ingrediente ingrediente");
        int quantidadeIngrediente = scanner.nextInt();
        scanner.nextLine();

        Ingrediente ingrediente = new Ingrediente(nomeIngrediente, quantidadeIngrediente);

        List<Receita> receitas = receitaPorIngrediente.get(ingrediente);

        System.out.println("Selecione uma receite");
        int i = 1;
        for (Receita receita : receitas) {
            System.out.println(i + "- Nome: " + receita.getNome() + " | Tempo: " + receita.getTempoDePreparo());
            i++;
        }
        System.out.println("Selecione a receita que deseja: ");
        int receitaSelecionada = scanner.nextInt();
        scanner.nextLine();

        System.out.println(receitas.get(receitaSelecionada - 1));

    }
}