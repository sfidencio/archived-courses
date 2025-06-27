public class Main {
    /*
    * TIPO	TAMANHO
    boolean	1 bit
    byte	1 byte
    short	2 bytes
    char	2 bytes
    int	4 bytes
    float	4 bytes
    long	8 bytes
    double	8 bytes
* */
    public static void main(String[] args) {
        System.out.println("Meu primeiro programa!");

        System.out.println("Divisao: " + 5 / 2);
        System.out.println("Divisao [prevalece double]: " + 5.0 / 2);

        System.out.println("Casting: ");
        double y = 2.9;
        int x = (int) y;
        System.out.println("Quando converte double para inteiro ele arredonda: (teremos perda de dados) " + x);

        int z = 10;
        double a = z;
        System.out.println("Aqui nao temos perda de dados: " + z);

        System.out.println();
        double salario = 234.9; //nao separa decimal com virgula
        int idade = 10;
        short numeroPequeno = 1234;
        long numeroGrande = 1029394939;
        byte b = -128; //-128 ate 127
        float pontoFlutuante = 3.14f;


        System.out.println("Tipo primitivos sao palavras chaves do java.");


        char letra = 'a';
        char letraTabelaUnicode = 167; //§
        char letraTabelaUnicodeSoma = (char) (letraTabelaUnicode + 50);
        System.out.println("Char => " + letra);
        System.out.println("Char Tabela Unicode => " + letraTabelaUnicode);
        System.out.println("Char Tabela Unicode Soma => " + letraTabelaUnicodeSoma);


        String curso = "Alura";
        System.out.println(curso);
    }
    /*
    *
    DE/PARA	byte	short	char	int	long	float	double
    byte	----	Impl.	(char)	Impl.	Impl.	Impl.	Impl.
    short	(byte)	----	(char)	Impl.	Impl.	Impl.	Impl.
    char	(byte)	(short)	----	Impl.	Impl.	Impl.	Impl.
    int	(byte)	(short)	(char)	----	Impl.	Impl.	Impl.
    long	(byte)	(short)	(char)	(int)	----	Impl.	Impl.
    float	(byte)	(short)	(char)	(int)	(long)	----	Impl.
    double	(byte)	(short)	(char)	(int)	(long)	(float)	----*/
}

