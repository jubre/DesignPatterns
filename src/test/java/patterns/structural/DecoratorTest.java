package patterns.structural;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecoratorTest {
	
	private Componente componente;
	
	@Before
	public void setUp(){
		componente = new ComponenteImpl();
	}

	@Test
	public void verifyBasicOperation(){
		String result = componente.basicOperation();
		assertEquals("flujo Normal", result);
	}
}
