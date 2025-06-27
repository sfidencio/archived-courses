package br.com.github.sfidencio.curso.alura.model;

public class Produto {
     private Long id;
     String descricao;

     protected Status status;

     public Produto() {
     }

     public Produto(Long id, String descricao) {
          this.id = id;
          this.descricao = descricao;
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getDescricao() {
          return descricao;
     }

     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }


     @Override
     public String toString() {
          return "Produto{" +
                  "id=" + id +
                  ", descricao='" + descricao + '\'' +
                  '}';
     }
}
