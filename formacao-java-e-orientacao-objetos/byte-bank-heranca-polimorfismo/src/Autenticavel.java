/*
 *Inteface é uma estrutura que tem como funcao especificar um contrato, definir o contorno do funcionamente de determinada funcionalidade
 *ou seja, nela não existe a principio implementacao, ela apenas dita para quem implementá-la, como as coisas devem funcionar
 * enfim, quem assinar o contrato com essa interface, deverá obrigatoriamente implementar suas exigencias,..
 * https://pt.stackoverflow.com/questions/136404/diferen%C3%A7a-entre-classe-e-interface
 *
 * NAO TEM NADA DE CONCRETO NA INTERFACE A PRINCIO!!!
 */
public interface Autenticavel {
    void setSenha(int senha);

    boolean autentica(int senha);
}
