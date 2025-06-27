package tiposprimitivos;

public class Main {
	/**
	 * @author Sebastiao Fidencio
	 */
	public static void main(String[] args) {
		int a,b,c;
		//Create in stack memory
		a=2;
		b=3;
		c=4;
		if(c==4) {
			//variable d, variable d, will be deallocated as soon as it leaves the IF scope
			int d=b;
			System.out.println("Value of D=>" + d);
		}
	}

}
