import static org.junit.Assert.*;

import org.junit.Test;

import br.com.alura.gerenciador.servlet.mvc.model.Usuario;

public class Teste {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Usuario u = new Usuario("fidencio", "1234");
		assertNotNull(u);
	}

}
