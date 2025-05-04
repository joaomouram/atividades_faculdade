package pscDouglas.calculos;

abstract class Operacao {
	protected double valor1;
	protected double valor2;
	
	// construtor sem parâmetros
	//public Operacao() {}
	
	// métodos get e set
	
	public double getValor1() {
		return valor1;
	}
	
 	public void setValor1(double valor1) {
 		this.valor1 = valor1;
 	}
 	
 	public double getValor2() {
 		return valor2;
 	}
 	
 	public void setValor2(double valor2) {
 		this.valor2 = valor2;
 	}
 	
 	// método abstract que será implementado nas subclasses
 	public abstract double Calcular();
}
