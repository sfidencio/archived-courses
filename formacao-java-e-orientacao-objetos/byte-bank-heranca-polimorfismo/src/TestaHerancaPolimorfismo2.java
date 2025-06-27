import outroexemplo.Carro;
import outroexemplo.Moto;
import outroexemplo.Veiculo;

public class TestaHerancaPolimorfismo2 {
    public static void main(String[] args) {
        //Sempre sera chamado o metodo mais especifico.
        //https://pt.wikipedia.org/wiki/Polimorfismo_(ci%C3%AAncia_da_computa%C3%A7%C3%A3o)
        Veiculo c1 = new Carro();
        c1.ligar();

        Veiculo c2 = new Moto();
        c2.ligar();


        Veiculo c3 = new Veiculo();
        c3.ligar();
    }
}