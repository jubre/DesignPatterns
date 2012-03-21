package patterns.structural;

public class DecoratorImpl implements Decorator {
	
	private Componente componente;
	
	public DecoratorImpl(Componente componente){
		this.componente = componente;
	}

	public String basicOperation() {
		StringBuilder sb = new StringBuilder();
		sb.append(componente.basicOperation());
		sb.append(extendOperation());
		return sb.toString();
	}

	public String extendOperation() {
		return " Extended";
	}

}
