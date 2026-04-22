import java.util.Scanner;

public class EntradaDados_27_parte2 {

	public static void main(String[] args) {
		
		
		
		String s1,s2,s3; 
		int j=0;
		
		
		System.out.println("ENTRE COM OS DADOS <<PARA CADA DADO UM ENTER>>: SE NAO USAR NEXLINE, ELE VAI LER SOMENTE UMA PALAVRA ");
		
		Scanner sc = new Scanner(System.in);
		j = sc.nextInt(); //apos nextdouble, nextint, tem que executar um nextLine vazio, para que seja absolvida o ENTER que usuario digitou pendente..
		sc.nextLine(); //Limpar o buffer... a quebra de linha que fica pendente.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:  ");
		System.out.println(j);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
