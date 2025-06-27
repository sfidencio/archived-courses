public enum Prioridade {
    MINIMO(1), MEDIO(5), MAXIMO(10);

    private int valor;
    Prioridade(int i) {
        this.valor = i;
    }

    public int getValor() {
        return this.valor;
    }
}
