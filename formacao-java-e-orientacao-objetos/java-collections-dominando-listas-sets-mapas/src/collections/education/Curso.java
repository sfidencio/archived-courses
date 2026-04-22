package collections.education;

import java.util.*;

/*
 *E o mistério da LinkedList?
 *E se tivéssemos usado ArrayList na declaração do atributo aulas da classe curso.Curso?
 * O resultado seria exatamente o mesmo!
 * Então qual é a diferença? Basicamente performance. A ArrayList,
 * como diz o nome, internamente usa uma array para guardar os elementos.
 * Ela consegue fazer umas operações de maneira muito eficiente, como invocar o método get(indice).
 * Se você precisa pegar o décimo quinto elemento, ele te devolve isso bem rápido. Onde uma ArrayList é lenta?
 * Quando você for, por exemplo, inserir um novo elemento na primeira posição. Pois a implementação
 * vai precisar mover todos os elementos que estão no começo da lista para a próxima posição. Se há
 * muitos elementos, isso vai demorar... chamamos isso em computação de consumo de tempo linear.
 * Já a LinkedList possui uma grande vantagem aqui.
 * Ela utiliza a estrutura de dados chamada lista ligada.
 * Ela é muito rápida para adicionar e remover elementos na cabeça da lista,
 * isso é, na primeira posição.
 * Mas ela é lenta se você precisar acessar um determinado elemento,
 * pois a implementação precisará percorrer todos os elementos até chegar ao décimo quinto, por exemplo.
 * Confuso? Não tem problema. Sabe o que é interessante?
 * Você não precisa tomar essa decisão desde já e oficializar para sempre.
 * Como utilizamos a referência a List, comprometendo-nos pouco, podemos sempre mudar a implementação,
 * isso é, em quem damos new, caso percebamos que é melhor uma ou outra lista nesse caso em particular.
 * Ainda está confuso? Veja código abaixo que
 * testa a inserção de 1 milhão de elementos com ArrayList e LinkedList,
 * medindo o tempo. Além disso, estamos removendo 100 elementos,
 * sempre tirando do início da lista. Execute e veja a diferença:
 */
public class Curso {
    private String nome;
    private Instrutor instrutor;
    private List<Aula> aulas = new ArrayList<>();

    private Set<Aluno> alunos = new HashSet<>();

    //Mantem ordem inseracao LinkedHashMap<K,V>
    //private Map<Integer, Aluno> alunosDePara = new LinkedHashMap<>();
    private Map<Integer, Aluno> alunosDePara = new HashMap<>();
    //Este e ThreadSafe
    //private Map<Integer, Aluno> alunosDePara2 = new Hashtable<>();

    public Curso(String nome, Instrutor instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }


    public String getNome() {
        return nome;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        //return aulas;//Ma pratica
        return Collections.unmodifiableList(this.aulas); //Imutabilidade
    }

    public void adicionar(Aula aula) {
        if (aula == null)
            throw new NullPointerException("Objeto nulo");
        this.aulas.add(aula);
    }

    @Override
    public String toString() {
        return "curso.Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                '}';
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(this.alunos);
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
        this.alunosDePara.put(aluno.getMatricula(), aluno);
    }

    public int calcularTempo() {
        int tempo = 0;
        for (Aula aula : this.aulas)
            tempo += aula.getTempo();
        return tempo;
    }

    public int calcularTempoFeatureJava8() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public boolean isMatriculado(Aluno aluno) {
        return this.getAlunos().contains(aluno);
    }

    public Aluno obterAlunoMatriculado(int matricula) {
        long ti = System.currentTimeMillis();
        for (Aluno aluno : this.getAlunos()) {
            if (aluno.getMatricula() == matricula) {
                long tf = System.currentTimeMillis();
                System.out.println("Tempo total(for): " + (tf - ti));
                return aluno;
            }
        }
        long tf = System.currentTimeMillis();
        System.out.println("Tempo total(for): " + (tf - ti));
        throw new NoSuchElementException("Nenhum aluno encontrado para matricula: " + matricula);
    }

    public Aluno obterAlunoMatriculadoV2(int matricula) {

        //quero checar se existe primeiro
        if (!this.alunosDePara.containsKey(matricula))
            throw new NoSuchElementException("Aluno com matricula: " + matricula + " inexistente!");
        //Se nao existe, por default retorna null..
        return this.alunosDePara.get(matricula);
    }


}
