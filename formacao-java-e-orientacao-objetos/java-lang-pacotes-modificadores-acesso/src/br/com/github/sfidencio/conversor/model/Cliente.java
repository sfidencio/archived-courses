package br.com.github.sfidencio.conversor.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;

    private List<Contato> contatos;

    public List<Contato> getContatos() {
        return contatos;
    }


    public Cliente() {
        if (this.contatos == null)
            this.contatos = new ArrayList<>(0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", contatos=" + contatos +
                '}';
    }
}
