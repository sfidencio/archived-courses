package boxunbox;

public class Main {
	/**
	 * @author Sebastiao Fidencio
	 * Box e Unbox, Wrapper classes
	 */
	public static void main(String[] args) {
		//Boxing
		//É o processo de conversão de um objeto tipo valor para um objeto tipo
		//referência compatível
		int x1 = 2;
		Object x2 = x1;
		System.out.println("[BOXING]=>Value converted from int(Value-Stack) to object(Ref-Heap): " + x2);

		//Unboxing
		//É o processo de conversão de um objeto tipo referência para um
		//objeto tipo valor compatível
		int x3 = (int) x2;
		System.out.println("[UNBOXING]=>Value converted from object(Ref) to int(Value-Stack): " + x3);
		
		Integer age = 10;
		
		//0-equals, -1-diff
		/*if(age.compareTo(10) == 0)
			System.out.println("OK");*/
		
		System.out.println(age.compareTo(15)); //Greater
		System.out.println(age.compareTo(10));//Equals
		System.out.println(age.compareTo(5));//Less
		
		
	}

}
