package modelo.reinoanimal;

public class Gato extends Mamifero {
    public void fazerBarulho(){
        System.out.println(this.getClass().getName() + ": Miau, Miau...=>" + getNome());
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
