package br.com.dio;

import java.math.BigDecimal;
import java.util.Objects;

import br.com.dio.model.Pessoa;

public class OlaMundoEclipse {

	public static void main(String[] args) {
		System.out.println("Hello World in Java Using Eclipse IDE!");

		Pessoa pessoa = new Pessoa(1L, "Joao Rocha", new BigDecimal("258.78"));
		System.out.println(pessoa.toString());
		
		Livro livro = new Livro("123456", new BigDecimal("78.47"), "Dominando Java 2º Edicao.") ;
		System.out.println(livro.toString());
	}

}

class Livro {
	private String isbn;
	private BigDecimal preco;
	private String titulo;

	public Livro(String isbn, BigDecimal preco, String titulo) {
		super();
		this.isbn = isbn;
		this.preco = preco;
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", preco=" + preco + ", titulo=" + titulo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn, preco, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(isbn, other.isbn) && Objects.equals(preco, other.preco)
				&& Objects.equals(titulo, other.titulo);
	}

}
