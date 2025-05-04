package pscDouglas.calculos;

class Multiplicacao extends Operacao{
	public Multiplicacao() {}
	
	@Override
	public double Calcular() {
		if (valor2 == 0) {
			throw new ArithmeticException("Toda multiplicação por zero é igual a zero.");
		} 
		return valor1 * valor2;
	}
}
