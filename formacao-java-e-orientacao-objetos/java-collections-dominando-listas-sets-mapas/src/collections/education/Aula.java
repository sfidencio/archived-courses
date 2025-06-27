package collections.education;

public class Aula implements Comparable<Aula> {
    private String descricao;
    private int tempo;

    public Aula(String descricao, int tempo) {
        this.descricao = descricao;
        this.tempo = tempo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getTempo() {
        return tempo;
    }


    @Override
    public String toString() {
        return "curso.Aula{" +
                "descricao='" + descricao + '\'' +
                ",tempo=" + tempo + " minutos" +
                '}';
    }

    @Override
    public int compareTo(Aula o) {
        return Integer.valueOf(this.getTempo()).compareTo(Integer.valueOf(o.getTempo()));
    }

   /* @Override
    public int compareTo(curso.Aula o) {
        return Integer.valueOf(this.getTempo()).compareTo(o.getTempo());
    }*/
}
