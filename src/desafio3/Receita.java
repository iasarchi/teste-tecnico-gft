package desafio3;

import java.util.ArrayList;
import java.util.List;

public class Receita {

    private String nome;
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private int tempoDePreparo;
    private String modoDePreparo;

    public Receita(String nome, List<Ingrediente> ingredientes, int tempoDePreparo, String modoDePreparo) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.tempoDePreparo = tempoDePreparo;
        this.modoDePreparo = modoDePreparo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(int tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }

    public String getModoDePreparo() {
        return modoDePreparo;
    }

    public void setModoDePreparo(String modoDePreparo) {
        this.modoDePreparo = modoDePreparo;
    }

    @Override
    public String toString() {
        return "Receita{" +
                "nome='" + nome + '\'' +
                ", ingredientes=" + ingredientes +
                ", tempoDePreparo=" + tempoDePreparo +
                ", modoDePreparo='" + modoDePreparo + '\'' +
                '}';
    }
}