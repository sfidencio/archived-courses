package modelo.reinoanimal;

public class Cachorro extends Mamifero {
    public void fazerBarulho() {
        System.out.println(this.getClass().getName() + ": Uau, Uau...=>" + getNome());
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
}
