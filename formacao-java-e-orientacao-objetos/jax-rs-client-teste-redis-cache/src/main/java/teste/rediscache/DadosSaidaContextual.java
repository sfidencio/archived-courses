package teste.rediscache;

import java.util.Objects;

public class DadosSaidaContextual {

    private String mala;
    private String limiteEmprestimo;
    private String limiteCompra;
    private String limiteSaque;
    private String campanha;
    private String cpf;

    public String getMala() {
        return mala;
    }

    public void setMala(String mala) {
        this.mala = mala;
    }

    public String getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(String limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public String getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(String limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public String getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(String limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public String getCampanha() {
        return campanha;
    }

    public void setCampanha(String campanha) {
        this.campanha = campanha;
    }

    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DadosSaidaContextual that = (DadosSaidaContextual) o;
        return Objects.equals(mala, that.mala) && Objects.equals(limiteEmprestimo, that.limiteEmprestimo) && Objects.equals(limiteCompra, that.limiteCompra) && Objects.equals(limiteSaque, that.limiteSaque) && Objects.equals(campanha, that.campanha) && Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mala, limiteEmprestimo, limiteCompra, limiteSaque, campanha, cpf);
    }

    @Override
    public String toString() {
        return "DadosSaidaContextual{" +
                "mala='" + mala + '\'' +
                ", limiteEmprestimo='" + limiteEmprestimo + '\'' +
                ", limiteCompra='" + limiteCompra + '\'' +
                ", limiteSaque='" + limiteSaque + '\'' +
                ", campanha='" + campanha + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
