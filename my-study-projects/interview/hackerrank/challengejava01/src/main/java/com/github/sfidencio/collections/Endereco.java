package com.github.sfidencio.collections;

import java.util.Objects;

public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Endereco endereco = (Endereco) o;
        return Objects.equals(rua, endereco.rua) && Objects.equals(cidade, endereco.cidade) && Objects.equals(estado, endereco.estado) && Objects.equals(cep, endereco.cep);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(rua);
        result = 31 * result + Objects.hashCode(cidade);
        result = 31 * result + Objects.hashCode(estado);
        result = 31 * result + Objects.hashCode(cep);
        return result;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
