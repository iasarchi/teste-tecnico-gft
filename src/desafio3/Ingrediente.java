package desafio3;


import java.util.Objects;

    public class Ingrediente {

        private String nome;
        private int quantidade;

        public Ingrediente(String nome, int quantidade) {
            this.nome = nome;
            this.quantidade = quantidade;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Ingrediente)) return false;
            Ingrediente that = (Ingrediente) o;
            return getNome().equals(that.getNome());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getNome());
        }

        @Override
        public String toString() {
            return "Ingrediente{" +
                    "nome='" + nome + '\'' +
                    ", quantidade=" + quantidade +
                    '}';
        }

        public String getNome() {
            return nome;
        }

        public int getQuantidade() {
            return quantidade;
        }
    }