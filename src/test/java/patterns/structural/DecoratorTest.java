package patterns.structural;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecoratorTest {
	
	private Componente componente;
	private Decorator decorator;
	
	@Before
	public void setUp(){
		componente = new ComponenteImpl();
		decorator = new DecoratorImpl(componente);
	}

	@Test
	public void verifyBasicOperation(){
		String result = componente.basicOperation();
		assertEquals("flujo Normal", result);
	}
	
	@Test
	public void verifyExtendedOperation(){
		String result = decorator.basicOperation();
		assertEquals("flujo Normal Extended", result);
	}
}
