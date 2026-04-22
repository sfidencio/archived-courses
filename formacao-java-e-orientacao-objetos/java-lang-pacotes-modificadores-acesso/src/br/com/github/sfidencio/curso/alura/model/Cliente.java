package br.com.github.sfidencio.curso.alura.model;

/**
 * @author sfidencio
 * @version 1.0
 * @since 01/08/2022
 * <p>
 * Modelo de cliente, representa entidade cliente do banco de dados.
 */
public class Cliente implements Cloneable {
    private Long id;
    private String nome;
    private String cpf;

    private double limite;

    public Cliente(Long id, String nome, String cpf, double limite) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.limite = limite;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", limite=" + limite +
                '}';
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
