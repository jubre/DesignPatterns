package patterns.structural;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DecoratorTest {
	
	private Componente componente;

	@Test
	public void verifyBasicOperation(){
		String result = componente.basicOperation();
		assertEquals("flujo Normal", result);
	}
}
