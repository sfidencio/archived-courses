public class Main2 {
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
        double num1 = 10.2;
        double num2 = num1 +1;
        System.out.println("Valor e nao referencia: " + num1);
        System.out.println("Valor e nao referencia: " + num2);
        System.out.println();
        //----------
        Double numRef1 = 10.2;
        Double numRef2 = numRef1 + 1;
        System.out.println("Valor e nao referencia: " + num1);
        System.out.println("Valor e nao referencia: " + num2);
    }
}

