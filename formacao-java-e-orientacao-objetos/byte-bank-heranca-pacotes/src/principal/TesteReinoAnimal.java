package principal;

import modelo.reinoanimal.Animal;
import modelo.reinoanimal.Cachorro;
import modelo.reinoanimal.Gato;

public class TesteReinoAnimal {
    public static void main(String[] args) {
        Cachorro meuTotozinho = new Cachorro();
        meuTotozinho.setNome("Cachorro");
        meuTotozinho.fazerBarulho();


        Gato meuGatinho = new Gato();
        meuGatinho.setNome("Gato");
        meuGatinho.fazerBarulho();

        //System.out.println(meuGatinho.getClass().getSuperclass().getSuperclass().getSuperclass());

    }
}
