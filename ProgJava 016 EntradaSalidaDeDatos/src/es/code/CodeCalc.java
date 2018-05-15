package es.code;

public class CodeCalc {
	
	private int a;
	private int b;

	public CodeCalc(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	private int suma() {
		return a+b;
	}
	
	private int resta() {
		return a-b;
	}
	
	private int mult() {
		return a*b;
	}
	
	private double div() {
		return a/b;
	}
	
	public Object calcula(String op) {
		Object resp = 0;
		switch (op) {
		case "suma":
			resp = suma();
			break;
		case "resta":
			resp = resta();
			break;
		case "mult":
			resp = mult();
			break;
		case "div":
			resp = div();
			break;
		default:
			System.out.println("Inserta una operación válida:\nsuma\nresta\nmult\ndiv");
			resp = null;
			break;
		}
		return resp;
	}
	
}
