package br.com.dio.model;
import java.math.BigDecimal;

public class Pessoa {
	private Long codigo;
	private String nome;
	private BigDecimal limiteCredito;

	public Pessoa(Long codigo, String nome, BigDecimal limiteCredito) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.limiteCredito = limiteCredito;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(BigDecimal limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", limiteCredito=" + limiteCredito + "]";
	}

}
